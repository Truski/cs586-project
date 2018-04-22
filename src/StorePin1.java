/*
  (Strategy Pattern) Strategy containing the implementation for GasPump1's StorePin action.
 */
public class StorePin1 extends StorePin{

  @Override
  public void StorePin(DataStore ds) {
    ds.set_pin(ds.get_temp_p());
  }
}
