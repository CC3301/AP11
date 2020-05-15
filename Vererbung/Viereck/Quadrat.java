public class Quadrat extends Viereck {

  // constructor
  Quadrat(double l) {
    Viereck.laenge = l;    
  }

  // Methods
  double diagonaleBerechnen() {
    return laenge * Math.sqrt(2);
  }

}
