public class Parallelogramm extends Viereck {
  
  double winkel;

  Parallelogramm(double l, double b, double w) {
    Viereck.laenge = l;
    Viereck.breite = b;
    this.winkel    = w;
  }
  
  // Methods
  double flaecheBerechnen() {
    return Viereck.laenge * Viereck.breite * Math.sin(Math.toRadians(winkel));
  }

  double diagonaleEBerechnen() {
    return Math.sqrt(Viereck.laenge * Viereck.laenge + Viereck.breite * Viereck.breite + 2 * Viereck.laenge * Viereck.breite * Math.cos(Math.toRadians(winkel)));
  }

  double diagonaleFBerechnen() {
    return Math.sqrt(Viereck.laenge * Viereck.laenge + Viereck.breite * Viereck.breite - 2 * Viereck.laenge * Viereck.breite * Math.cos(Math.toRadians(winkel)));
  }
}
