/*
  (Strategy Pattern) (Also a product in Abstract Factory Pattern) Strategy containing the implementation for GasPump2's GasPumpedMsg action.
 */
public class GasPumpedMsg2 extends GasPumpedMsg {
  @Override
  public void GasPumpedMsg(DataStore ds) {
    System.out.println("\tLITERS PUMPED: " + ds.get_L());
    System.out.println(String.format("\tTOTAL: %.2f", ds.get_total()));
  }
}
