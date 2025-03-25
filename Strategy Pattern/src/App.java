import TP.CardPayment;
import TP.PaidMethod;

public class App {
  public static void main(String[] args) throws Exception {
    PaidMethod p = new PaidMethod();
    p.setPaymentStrategy(new CardPayment("123 456 789"));
    p.checkout(10);
  }
}
