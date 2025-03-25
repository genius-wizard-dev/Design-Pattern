package DP;

public class MilkDecorator extends CoffeDecorator {

  public MilkDecorator(Coffe c) {
    super(c);
  }

  @Override
  public double cost() {
    return coffe.cost() + 5000;
  }

  @Override
  public String getDesciption() {
    // TODO Auto-generated method stub
    return coffe.getDesciption() + " them sua";
  }

}
