package OP;

public class People implements Observer {
  private String name;

  public People(String name) {
    this.name = name;
  }

  @Override
  public void update(double pricing) {
    System.out.println(name + " new pricing " + pricing);
  }

}
