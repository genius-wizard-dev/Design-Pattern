package SP;

public class SleepState implements State {

  @Override
  public void handleComputer(Computer c) {
    System.out.println("Computer is On");
    c.setState(new OnState());
  }

}
