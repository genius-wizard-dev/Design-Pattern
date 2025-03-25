package TP;

public class CardPayment implements PaymentStratery {
  private String cardNumber;

  public CardPayment(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  @Override
  public void pay(int amount) {
    System.out.println("Paid " + amount + " via Credit Card with number " + cardNumber);
  }

}
