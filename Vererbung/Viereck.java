import java.lang.Math;

public class Viereck {

  protected static double breite;
  protected static double laenge;

  // Methods
  double flaecheBerechnen() {
    return breite * laenge;
  }

  double umfangBerechnen() {
    return 2 * breite + 2 * laenge;
  }


}
