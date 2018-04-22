/*
  (Strategy Pattern) (Also a product in Abstract Factory Pattern) Strategy containing the implementation for GasPump2's StoreCash action.
 */
public class StoreCash2 extends StoreCash {
  @Override
  public void StoreCash(DataStore ds) {
    ds.set_cash(ds.get_temp_cash());
  }
}
