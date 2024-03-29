/*
  (Strategy Pattern) (Also a product in Abstract Factory Pattern) Strategy containing the implementation for GasPump2's PrintReceipt action.
 */
public class PrintReceipt2 extends PrintReceipt {
  @Override
  public void PrintReceipt(DataStore ds) {
    System.out.println("RECEIPT");
    System.out.println("# OF LITERS: " + ds.get_L());
    System.out.println(String.format("Total: $%.2f", ds.get_total()));
  }
}
