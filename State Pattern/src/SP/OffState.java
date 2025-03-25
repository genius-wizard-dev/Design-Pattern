package SP;

public class OffState implements State {

  @Override
  public void handleComputer(Computer c) {
    System.out.println("Computer is On");
    c.setState(new OnState());
  }
}
