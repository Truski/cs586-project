/*
  (Strategy Pattern) (Also a product in Abstract Factory Pattern) Strategy containing the implementation for GasPump1's SetInitialValues action.
 */
public class SetInitialValues1 extends SetInitialValues {
  @Override
  public void SetInitialValues(DataStore ds) {
    ds.set_G(0);
    ds.set_total(0);
  }
}
