package Pattern;

public class BankFactory {
  public static Bank getBank(String bankCode) {
    switch (bankCode) {
      case "TPB":
        return new TPBank();
      case "MBB":
        return new MBBank();
      case "SCB":
        return new Sacombank();
      default:
        return null;
    }
  }
}
