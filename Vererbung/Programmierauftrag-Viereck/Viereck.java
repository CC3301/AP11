import java.lang.Math;

public class Viereck {

  protected static double breite;
  protected static double laenge;

  // Methods
  double flaecheBerechnen() {
    return Math.round(breite * laenge);
  }

  double umfangBerechnen() {
    return Math.round(2 * breite + 2 * laenge);
  }


}
