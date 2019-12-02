public class Verbrauch {

  private double strecke;
  private double spritMenge;
  private double spritPreis;

  // Constructor
  Verbrauch(double strecke, double spritMenge, double spritPreis) {
    this.strecke = strecke;
    this.spritMenge = spritMenge;
    this.spritPreis = spritPreis;
  }

  // Constructor, no params
  Verbrauch() {

  }

  public double verbrauchPro100Km() {
    return 100 * (spritMenge / strecke);
  }
  public double kostenPro100Km() {
    return verbrauchPro100Km() * spritPreis;
  }
  public double kostenPro1Km() {
    return kostenPro100Km() / 100;
  }
  public double streckeMit1Liter() {
    return 1 / (verbrauchPro100Km() / 100);
 }
 public double spezifischeCO2Emission(String spritArt) {
   if (spritArt.equalsIgnoreCase("diesel")) {
     return (spritMenge * 2.62) * (spritMenge * streckeMit1Liter()); 
   } else if (spritArt.equalsIgnoreCase("benzin")) {
     return (spritMenge * 2.32) * (spritMenge * streckeMit1Liter()); 
   } else {
     throw new RuntimeException();
   }
  }
}
