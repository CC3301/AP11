// Berufsschul-spezifische 
public class Berufsschule extends Schule {

  // privater string beruf
  private String beruf;
  private char berufsabschluss;
  private char ausbildungsverhaeltnis;
  private int schulabschluss;
  private boolean loop;


  // Beruf daten setzen
  public void setBerufDaten() {

    // Berufsbezeichnung einlesen
    System.out.print("Berufsbezeichnung eingeben: ");
    beruf = Schule.sc.next();

    // Besteht bereits ein abschluss?
    loop = true;
    do {
      System.out.print("Ist bereits ein berufsabschluss vorhanden? [j/n] ");
      berufsabschluss = Schule.sc.next().charAt(0);
  
      // testen ob die eingabe valide ist
      if ("j".equals(String.valueOf(berufsabschluss)) || "n".equals(String.valueOf(berufsabschluss))) {
        loop = false;
      } else {
        //System.out.println("Bitte j oder n angeben");
        loop = true;
      }

    } while (loop == true);

    // Besteht ein ausbildungsverhaeltnis?
    loop = true;
    do {
      System.out.print("Besteht ein Ausbildungsverhaeltnis? [j/n] ");
      ausbildungsverhaeltnis = Schule.sc.next().charAt(0);
      
      // testen ob die eingabe valide ist
      if ("j".equals(String.valueOf(ausbildungsverhaeltnis)) || "n".equals(String.valueOf(ausbildungsverhaeltnis))) {
        loop = false;
      } else {
        //System.out.println("Bitte j oder n angeben");
        loop = true;
      }

    } while (loop == true);


    // Schulabschluss des Schuelers einlesen
    System.out.println("Schulabschluss auswaehlen");
    System.out.println("1: einfacher        Hauptschulabschluss");
    System.out.println("2: qualifizierender Hauptschulabschluss");
    System.out.println("3: Mittlere Reife");
    System.out.println("4: Abitur");
    System.out.println("5: Fachgebundene Hochschulreife");
    System.out.println("6: Fachhochschulreife");
    // warten auf valide eingabe des users
    do {

      schulabschluss = Schule.sc.nextInt();

      // loop erst stoppen wenn eine valide eingabe passiert ist
      if (schulabschluss == 1 || schulabschluss == 2 || schulabschluss == 3 || schulabschluss == 4 || schulabschluss == 5 || schulabschluss == 6) {
        loop = false;
      } else {
        //System.out.println("Bitte eine Zahl zwischen 1 und 6 angeben");
        loop = true;
      }

    } while (loop == true);

  }

  // test des alter des schueler auf die volljaehrigkeit
  public String volljaehrigkeitPruefen() {
  
    // bekomme das alter des schuelers
    int alter = Schule.alterBestimmen();

    // ist der schueler ueber oder 18?
    if (alter >= 18) {
      return("Volljaehrig");
    } else {
      return("nicht Volljaehrig");
    }

  }

  // Schulpflicht pruefen
  public String schulpflichtPruefen() {

    int alter = Schule.alterBestimmen();

    if ("j".equals(String.valueOf(berufsabschluss))) {
      return("Der schueler ist berufsschulberechtigt");
    } else {
      if (alter >= 21) {
        return("Der schueler ist berufsschulberechtigt");
      } else {
        if (schulabschluss == 1) {
          return("Der schueler ist berufsschulpflichtig");
        } else if (schulabschluss == 2) {
          return("Der schueler ist berufsschulpflichtig");
        } else if (schulabschluss == 3) {
          if ("j".equals(String.valueOf(ausbildungsverhaeltnis))) {
            return("Der schueler ist berufsschulpflichtig");
          } else {
            return("Der schueler ist berufsschulbefreit");
          }
        } else {
          return("Der schueler ist berufsschulberechtigt");
        }
      }
    }

  }

  // daten ausgeben
  public void datenAusgeben() {
    super.datenAusgeben();
    if(schulabschluss == 1) {
      System.out.println("Der schueler hat einen einfachen Hauptschulabschluss");
    } else if (schulabschluss == 2) {
      System.out.println("Der schueler hat einen qualifizierenden Hauptschulabschluss");
    } else if (schulabschluss == 3) {
      System.out.println("Der schueler hat die mittlere Reife");
    } else if (schulabschluss == 4) {
      System.out.println("Der schueler hat ein Abitur");
    } else if (schulabschluss == 5) {
      System.out.println("Der schueler hat eine fachgebundene Hochschulreife");
    } else if (schulabschluss == 6) {
      System.out.println("Der schueler hat eine Fachhochschulreife");
    }
    System.out.println("Der schueler ist " + volljaehrigkeitPruefen());
    System.out.println(schulpflichtPruefen());
    System.out.println("Der schueler lernt den Beruf: \"" + beruf + "\"\n\n");
  }


}
