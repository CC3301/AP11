// Import scanner
import java.util.Scanner;

// Schule Stammklasse
public class Schule {

  // Stamm daten
  protected static String name;
  protected static String vorname;
  protected static int gebJahr;

  // Scanner
  protected static Scanner sc = new Scanner(System.in);


  // stamm daten setzen
  public void setStamm() {

    // Scanner erzeugen 
    //Scanner sc = new Scanner(System.in);

    // Namen einlesen
    System.out.print("Nachnamen eingeben: ");
    name = sc.next();

    // Vornamen einlesen
    System.out.print("Vornamen eingeben: ");
    vorname = sc.next();

    // Geburtsjahr einlesen
    System.out.print("Geburtsjahr eingeben: ");
    gebJahr = sc.nextInt();

    //sc.close();

  }

  public static int alterBestimmen() {  
    return(2020-gebJahr);
  }

  public void datenAusgeben() {
    System.out.println("\n\n**************************************");
    System.out.println("Schueler Akte:\n");
    System.out.println("Vorname   : " + vorname);
    System.out.println("Nachname  : " + name);
    System.out.println("Geboren in: " + gebJahr);
    System.out.print("\n");
  }

}
