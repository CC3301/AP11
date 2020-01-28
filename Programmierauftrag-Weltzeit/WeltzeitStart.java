import java.util.Scanner;

public class WeltzeitStart {

  public static void main(String[] args) {

    // Scanner und weltzeit objekt anlegen
    Scanner  sc = new Scanner(System.in);
    Weltzeit wz = new Weltzeit();

    // user eingabe, auswahl ob ortszeit oder muczeit
    System.out.println("Ortszeit oder Muenchenzeit berechnen?(o/m)");
    String auswahl = sc.nextLine();

    // ortszeit ausrechen
    if (auswahl.equalsIgnoreCase("o")) {

      System.out.print("Bitte Ort in Brasilien eingeben: ");
      String ort  = sc.nextLine();
  
      System.out.print("Bitte brasilianische Uhrzeit des Spiels eingeben(hh:mm): ");
      String zeit = sc.nextLine();
  
      // zeit berechnen
      String mucZeit = wz.bestimmeMucZeit(ort, zeit);
  
      // ausgabe
      System.out.println("Spielstaette in Brasilien:\n" + ort);
      System.out.println("Uhrzeit in " + ort + " (hh:mm)\n" + zeit);
      System.out.println("**************************************************");
      System.out.println("Uhrzeit in Muenchen\n" + mucZeit);
    
    // muenchen Zeit ausgeben
    } else if (auswahl.equalsIgnoreCase("m")) {

      System.out.print("Bitte Ort in Brasilien eingeben: ");
      String ort  = sc.nextLine();
  
      System.out.print("Bitte eine muenchener Uhrzeit eingeben(hh:mm): ");
      String zeit = sc.nextLine();
  
      // zeit berechnen
      String mucZeit = wz.bestimmeOrtsZeit(ort, zeit);
  
      // ausgabe
      System.out.println("Ort in Brasilien:\n" + ort);
      System.out.println("Uhrzeit in " + ort + " (hh:mm)\n" + zeit);
      System.out.println("**************************************************");
      System.out.println("Uhrzeit in Muenchen\n" + mucZeit);

    } else {
      System.out.println("Unbekannte Option.");
      main(null);
    }




    // Scanner schliessen
    sc.close();

  }

}