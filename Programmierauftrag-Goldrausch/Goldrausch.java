public class Goldrausch {

  public static void main(String[] args) {

    Gold gold = new Gold();
    gold.gramm = 100;
    gold.grammInUnze();
    System.out.println(gold.bekommeGoldwert(1322.77) + " Euro");
    
  }
}
