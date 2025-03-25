package SP;

public class Computer {
  private State state;

  public Computer() {
    this.state = new OffState();
  }

  public void setState(State state) {
    this.state = state;
  }

  public void pressPower() {
    state.handleComputer(this);
  }
}
