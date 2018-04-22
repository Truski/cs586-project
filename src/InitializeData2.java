/*
  (Strategy Pattern) (Also a product in Abstract Factory Pattern) Strategy containing the implementation for GasPump2's InitializeData action.
 */
public class InitializeData2 extends InitializeData {
  @Override
  public void InitializeData(DataStore ds) {
    ds.set_price(0);
    ds.set_cash(0);
  }
}
