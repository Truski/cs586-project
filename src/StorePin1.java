public class StorePin1 extends StorePin{

  @Override
  public void StorePin(DataStore ds) {
    ds.set_pin(ds.get_temp_p());
  }
}
