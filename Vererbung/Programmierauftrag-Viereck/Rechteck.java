public class Rechteck extends Viereck {

  // Constructor
  Rechteck(double l, double b) {
    Viereck.laenge = l;
    Viereck.breite = b;
  }

  // Methods
  double diagonaleBerechnen() {
    return Math.round(Math.sqrt(Viereck.laenge*Viereck.laenge + Viereck.breite*Viereck.breite));
  }

}
