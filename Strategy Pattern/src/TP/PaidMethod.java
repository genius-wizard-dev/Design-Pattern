package TP;

public class PaidMethod {
  private PaymentStratery stratery;

  public PaidMethod() {
  }

  public void setPaymentStrategy(PaymentStratery stratery) {
    this.stratery = stratery;
  }

  public void checkout(int amount) {
    this.stratery.pay(amount);
  }
}
