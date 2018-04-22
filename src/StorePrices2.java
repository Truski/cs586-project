/*
  (Strategy Pattern) Strategy containing the implementation for GasPump2's StorePrices action.
 */
public class StorePrices2 extends StorePrices{
  @Override
  public void StorePrices(DataStore ds) {
    ds.set_Sprice(ds.get_temp_a());
    ds.set_Rprice(ds.get_temp_b());
    ds.set_Pprice(ds.get_temp_c());
    System.out.println("GAS PUMP IS ACTIVATED");
  }
}
