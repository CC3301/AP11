public class Quadrat extends Viereck {

  // constructor
  Quadrat(double l) {
    Viereck.laenge = l;    
  }

  // Methods
  double diagonaleBerechnen() {
    return Math.round(laenge * Math.sqrt(2));
  }

}
