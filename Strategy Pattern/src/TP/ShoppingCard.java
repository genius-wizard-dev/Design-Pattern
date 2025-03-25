package TP;

public class ShoppingCard implements PaymentStratery {
  private String cardNumber;

  public ShoppingCard(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  @Override
  public void pay(int amount) {
    System.out.println("Paid " + amount + " via Shopping card with number " + this.cardNumber);
  }

}
