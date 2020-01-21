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
      return 2.62 * (this.spritMenge / this.strecke);
    } else if (spritArt.equalsIgnoreCase("benzin")) {
      return 2.32 * (this.spritMenge / this.strecke);
    } else {
      return 0.0;
    }
  }
  public double absoluteCO2Emission(String spritArt) {
    if (spritArt.equalsIgnoreCase("diesel")) {
      return (this.spezifischeCO2Emission(spritArt) * this.strecke) / 1000;
    } else if (spritArt.equalsIgnoreCase("benzin")) {
      return (this.spezifischeCO2Emission(spritArt) * this.strecke) / 1000;
    } else {
      return 0.0;
    }
  }
}
