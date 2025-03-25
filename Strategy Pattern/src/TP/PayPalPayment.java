package TP;

public class PayPalPayment implements PaymentStratery {
  private String accountNumber;

  public PayPalPayment(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  @Override
  public void pay(int amount) {
    System.out.println("Paid " + amount + " via PayPal with account number " + this.accountNumber);
  }

}
