/*
  (Strategy Pattern) Strategy containing the implementation for GasPump1's InitializeData action.
 */
public class InitializeData1 extends InitializeData {
  @Override
  public void InitializeData(DataStore ds) {
    ds.set_price(0);
  }
}
