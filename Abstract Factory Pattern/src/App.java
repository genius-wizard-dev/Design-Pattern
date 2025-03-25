import AFP.Bed;
import AFP.Chair;
import AFP.Furniture;
import AFP.ModernFurniture;
import AFP.Table;

public class App {
  public static void main(String[] args) throws Exception {
    Furniture mf = new ModernFurniture();
    Chair c = mf.createChair();
    Table t = mf.createTable();
    Bed b = mf.createBed();
    c.sitOn();
    t.putOn("Bottle");
    b.lieOn();
  }
}
