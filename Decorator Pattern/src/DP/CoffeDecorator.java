package DP;

abstract class CoffeDecorator implements Coffe {
  protected Coffe coffe;

  public CoffeDecorator(Coffe coffe) {
    this.coffe = coffe;
  }

  @Override
  public double cost() {
    return coffe.cost();
  }

  @Override
  public String getDesciption() {
    return coffe.getDesciption();
  }

}
