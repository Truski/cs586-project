public class GasPumpedMsg2 extends GasPumpedMsg {
  @Override
  public void GasPumpedMsg(DataStore ds) {
    System.out.println("\tLITERS PUMPED: " + ds.get_L());
    System.out.println(String.format("\tTOTAL: %.2f", ds.get_total()));
  }
}
