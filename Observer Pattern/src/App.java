import OP.People;
import OP.Stock;

public class App {
  public static void main(String[] args) throws Exception {
    Stock s = new Stock(15000);
    People p1 = new People("Nguyen Van A");
    People p2 = new People("Nguyen Van B");
    People p3 = new People("Nguyen Van C");
    s.register(p1);
    s.register(p2);
    s.setPricing(20000);
    s.setPricing(22000);
    s.register(p3);
    s.setPricing(30000);
    s.remove(p1);
    s.remove(p2);
    s.setPricing(10000);
  }
}
