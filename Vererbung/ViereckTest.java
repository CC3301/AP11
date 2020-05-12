import java.util.Scanner;

public class ViereckTest {
  public static void main(String[] args) {
    
    double laenge;
    double breite;
    double winkel;

    Scanner sc = new Scanner(System.in);
   
    // read in values
    System.out.print("Bitte gib die laenge ein (cm)  : ");
    laenge = sc.nextDouble();

    System.out.print("Bitte gib die breite ein (cm)  : ");
    breite = sc.nextDouble();

    System.out.print("Bitte gib den winkel ein (Grad): ");
    winkel = sc.nextDouble();

    sc.close();

    // create all objects
    System.out.print("TEST: erzeuge objekte.. ");
    Quadrat testQuadrat               = new Quadrat(laenge);
    Rechteck testRechteck             = new Rechteck(laenge, breite);
    Parallelogramm testParallelogramm = new Parallelogramm(laenge, breite, winkel);
    System.out.println("[OK]");

    // test the quadrat functions
    System.out.println("TEST: Berechne Werte fuer Quadrat.. ");
    System.out.println("\tLaenge   : " + laenge                           + "cm" );
    System.out.println("\tFlaeche  : " + testQuadrat.flaecheBerechnen()   + "cm2");
    System.out.println("\tUmfang   : " + testQuadrat.umfangBerechnen()    + "cm" );
    System.out.println("\tDiagonale: " + testQuadrat.diagonaleBerechnen() + "cm" );
    System.out.println("[OK]");

    // test the rechteck functions
    System.out.println("TEST: Berechne Werte fuer Rechteck.. ");
    System.out.println("\tLaenge   : " + laenge                            + "cm" );
    System.out.println("\tBreite   : " + breite                            + "cm" );
    System.out.println("\tFlaeche  : " + testRechteck.flaecheBerechnen()   + "cm2");
    System.out.println("\tUmfang   : " + testRechteck.umfangBerechnen()    + "cm" );
    System.out.println("\tDiagonale: " + testRechteck.diagonaleBerechnen() + "cm" );
    System.out.println("[OK]");

    // test the parallelogramm functions
    System.out.println("TEST: Berechne Werte fuer Parallelogramm.. ");
    System.out.println("\tLaenge    : " + laenge                                   + "cm" );
    System.out.println("\tBreite    : " + breite                                   + "cm" );
    System.out.println("\tFlaeche   : " + testParallelogramm.flaecheBerechnen()    + "cm2");
    System.out.println("\tUmfang    : " + testParallelogramm.umfangBerechnen()     + "cm2");
    System.out.println("\tDiagonaleE: " + testParallelogramm.diagonaleEBerechnen() + "cm2");
    System.out.println("\tDiagonaleF: " + testParallelogramm.diagonaleFBerechnen() + "cm2");
    System.out.println("[OK]");

  }
}
