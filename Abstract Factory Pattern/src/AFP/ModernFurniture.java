package AFP;

public class ModernFurniture implements Furniture {

  @Override
  public Bed createBed() {
    return new ModernBed();
  }

  @Override
  public Chair createChair() {
    return new ModernChair();
  }

  @Override
  public Table createTable() {
    return new ModernTable();
  }

}
