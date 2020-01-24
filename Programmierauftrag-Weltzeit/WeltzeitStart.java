import java.util.Scanner;

public class WeltzeitStart {

  public static void main(String[] args) {

    // Scanner und weltzeit objekt anlegen
    Scanner  sc = new Scanner(System.in);
    Weltzeit wz = new Weltzeit();

    // user eingabe
    System.out.print("Bitte Ort in Brasilien eingeben: ");
    String ort  = sc.nextLine();

    System.out.print("Bitten brasilianische Uhrzeit des Spiels eingeben(hh:mm): ");
    String zeit = sc.nextLine();

    // zeit berechnen
    String mucZeit = wz.bestimmeMucZeit(ort, zeit);

    // ausgabe
    System.out.println("Spielstaette in Brasilien:\n" + ort);
    System.out.println("Uhrzeit in " + ort + " (hh:mm)\n" + zeit);
    System.out.println("**************************************************");
    System.out.println("Uhrzeit in Muenchen\n" + mucZeit);


    // Scanner schliessen
    sc.close();

  }

}