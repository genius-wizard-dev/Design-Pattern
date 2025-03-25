import Pattern.Bank;
import Pattern.BankFactory;

public class App {
  public static void main(String[] args) {
    Bank bank = BankFactory.getBank("MBB");
    System.out.println(bank.getName());
  }
}
