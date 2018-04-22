/*
  (Strategy Pattern) Strategy containing the implementation for GasPump2's SetInitialValues action.
 */
public class SetInitialValues2 extends SetInitialValues {
  @Override
  public void SetInitialValues(DataStore ds) {
    ds.set_L(0);
    ds.set_total(0);
  }
}
