public class PumpGasUnit2 extends PumpGasUnit {
  @Override
  public void PumpGasUnit(DataStore ds) {
    ds.set_L(ds.get_L() + 1);
    ds.set_total(ds.get_price() * ds.get_G());
  }
}
