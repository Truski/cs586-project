/*
  (Strategy Pattern) (Also a product in Abstract Factory Pattern) Strategy containing the implementation for GasPump1's StorePrices action.
 */
public class StorePrices1 extends StorePrices {
  @Override
  public void StorePrices(DataStore ds) {
    ds.set_Rprice(ds.get_temp_a());
    ds.set_Dprice(ds.get_temp_b());
    System.out.println("Gas Pump is Activated");
  }
}
