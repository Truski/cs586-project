public class PrintReceipt1 extends PrintReceipt {
  @Override
  public void PrintReceipt(DataStore ds) {
    System.out.println("Receipt:");
    System.out.println("# of Gallons: " + ds.get_G());
    System.out.println("Total: $" + ds.get_total());
  }
}
