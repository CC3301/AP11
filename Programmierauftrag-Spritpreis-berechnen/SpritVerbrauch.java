import java.util.Scanner;
public class SpritVerbrauch {

  public static void main(String[] args) {

    // scanner
    Scanner sc = new Scanner(System.in);

    // user input
    System.out.print("Geben Sie gefahrene Strecke ein: ");
    double strecke = sc.nextDouble();

    System.out.print("Geben Sie die verbrauchte Spritmenge an: ");
    double menge = sc.nextDouble();

    System.out.print("Geben Sie den Literpreis an: ");
    double preis = sc.nextDouble();

    System.out.print("Geben Sie die Sprit Art ein (diesel/bezin): ");
    String spritArt = sc.next();

    // new verbrauch obj
    Verbrauch verbrauch = new Verbrauch(strecke, menge, preis);

    // output
    System.out.println("********************************");
    System.out.println("Gefahrene Strecke: " + strecke);
    System.out.println("Sprit Preis pro Liter: " + preis);
    System.out.println("Verbrauchte Spritmenge: " + menge + "\n");
    System.out.println("Verbrauch auf 100 km: " + verbrauch.verbrauchPro100Km());
    System.out.println("Kosten pro 100 Km: " + verbrauch.kostenPro100Km());
    System.out.println("Kosten pro 1 Km: " + verbrauch.kostenPro1Km());
    System.out.println("Strecke mit 1 Liter: " + verbrauch.streckeMit1Liter());
    System.out.println("Gretas nervoesitaet: " + spezifischeCO2Emission(spritArt));
    System.out.println("********************************");
  }
}
