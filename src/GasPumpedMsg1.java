public class GasPumpedMsg1 extends GasPumpedMsg {
  @Override
  public void GasPumpedMsg(DataStore ds) {
    System.out.println("# of gallons pumped: " + ds.get_G());
    System.out.println("Total: $" + ds.get_total());
  }
}
