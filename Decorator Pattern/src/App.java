import DP.Coffe;
import DP.MilkDecorator;
import DP.SimpleCoffe;

public class App {
  public static void main(String[] args) throws Exception {
    Coffe c = new SimpleCoffe();
    System.out.println(c.getDesciption());
    System.out.println(c.cost());
    c = new MilkDecorator(c);
    System.out.println(c.getDesciption());
    System.out.println(c.cost());

  }
}
