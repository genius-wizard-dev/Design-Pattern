package SP;

public class OnState implements State {

  @Override
  public void handleComputer(Computer c) {
    System.out.println("Computer Sleep.");
    c.setState(new SleepState());
  }

}
