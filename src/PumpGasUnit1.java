/*
  (Strategy Pattern) Strategy containing the implementation for GasPump1's PumpGasUnit action.
 */
public class PumpGasUnit1 extends PumpGasUnit {
  @Override
  public void PumpGasUnit(DataStore ds) {
    ds.set_G(ds.get_G() + 1);
    ds.set_total(ds.get_price() * ds.get_G());
  }
}
