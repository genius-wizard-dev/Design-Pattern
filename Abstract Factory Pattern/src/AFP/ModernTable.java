package AFP;

public class ModernTable implements Table {

  @Override
  public void putOn(String item) {
    System.out.println("Đặt " + item + " lên bàn");
  }

}
