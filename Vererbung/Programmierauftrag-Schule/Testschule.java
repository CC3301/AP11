public class Testschule {

  public static void main(String[] args) {
    
    // Berufsschule objekt erzeugen
    Berufsschule bs = new Berufsschule();

    // stammdaten einlesen
    bs.setStamm();

    // Berufsschul-spezifische Daten einlesen
    bs.setBerufDaten();

    // daten ausgeben
    bs.datenAusgeben();

  }

}
