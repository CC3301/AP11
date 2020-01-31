import java.util.Scanner;
public class RundenTest {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Zahl zum Runden eingeben: ");
    double zahl = sc.nextDouble();
    System.out.print("Auf wie viele Stellen soll gerundet werden? ");
    int stellen = sc.nextInt();
    sc.close();

    System.out.println("Originale Zahl: " + zahl);
    zahl = Helfer.runden(zahl, stellen);
    System.out.println("Gerundete Zahl: " + zahl);

  }

}