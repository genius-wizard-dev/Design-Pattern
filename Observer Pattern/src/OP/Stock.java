package OP;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
  private List<Observer> o = new ArrayList<>();
  private double pricing;

  public Stock(List<Observer> o) {
    this.o = o;
  }

  public Stock(double pricing) {
    this.pricing = pricing;
  }

  public Stock() {
  }

  public Stock(List<Observer> o, double pricing) {
    this.o = o;
    this.pricing = pricing;
  }

  @Override
  public void notifyObserver() {
    for (Observer observer : o) {
      observer.update(pricing);
    }
  }

  @Override
  public void register(Observer o) {
    this.o.add(o);
  }

  @Override
  public void remove(Observer o) {
    this.o.remove(o);
  }

  public void setPricing(double pricing) {
    this.pricing = pricing;
    notifyObserver();
  }
}
