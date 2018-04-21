public class StoreCash2 extends StoreCash {
  @Override
  public void StoreCash(DataStore ds) {
    ds.set_cash(ds.get_temp_cash());
  }
}
