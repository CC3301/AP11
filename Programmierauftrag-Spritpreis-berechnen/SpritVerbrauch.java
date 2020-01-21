import java.util.Scanner;
public class SpritVerbrauch {

  public static void main(String[] args) {

    // scanner
    Scanner sc = new Scanner(System.in);

    // user input
    System.out.print("Geben Sie gefahrene Strecke ein(km): ");
    double strecke = sc.nextDouble();

    System.out.print("Geben Sie die verbrauchte Spritmenge an(Liter): ");
    double menge = sc.nextDouble();

    System.out.print("Geben Sie den Literpreis an (Euro): ");
    double preis = sc.nextDouble();

    System.out.print("Geben Sie die Sprit Art ein (diesel/benzin): ");
    String spritArt = sc.next();

    // new verbrauch obj
    Verbrauch verbrauch = new Verbrauch(strecke, menge, preis);

    // output
    System.out.println("********************************");
    System.out.println("Gefahrene Strecke: " + strecke + " km");
    System.out.println("Sprit Preis pro Liter: " + preis + " Euro");
    System.out.println("Verbrauchte Spritmenge: " + menge + " Liter\n");
    System.out.println("Verbrauch auf 100 km: " + verbrauch.verbrauchPro100Km() + " Liter");
    System.out.println("Kosten pro 100 Km: " + verbrauch.kostenPro100Km() + " Euro");
    System.out.println("Kosten pro 1 Km: " + verbrauch.kostenPro1Km() + " Euro");
    System.out.println("Strecke mit 1 Liter: " + verbrauch.streckeMit1Liter() + " km");
    System.out.println("Spezifische CO2 Emission: " + verbrauch.spezifischeCO2Emission(spritArt) + " Gramm pro km");
    System.out.println("Absolute CO2 Emission: " + verbrauch.absoluteCO2Emission(spritArt) + " Kg auf " + strecke + " km");
    System.out.println("********************************");
  }
}
