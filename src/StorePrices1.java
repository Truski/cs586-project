public class StorePrices1 extends StorePrices {
  @Override
  public void StorePrices(DataStore ds) {
    ds.set_Rprice(ds.get_temp_a());
    ds.set_Dprice(ds.get_temp_b());
    System.out.println("Gas Pump is Activated");
  }
}
