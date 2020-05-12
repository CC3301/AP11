import java.lang.Math;

public class Viereck {

  protected double breite;
  protected double laenge;

  // Methods
  double flaecheBerechnen() {
    return breite * laenge;
  }

  double umfangBerechnen() {
    return 2 * breite + 2 * laenge;
  }


}
