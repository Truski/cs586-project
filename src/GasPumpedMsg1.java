/*
  (Strategy Pattern) (Also a product in Abstract Factory Pattern) Strategy containing the implementation for GasPump1's GasPumpedMsg action.
 */
import java.util.Locale;

public class GasPumpedMsg1 extends GasPumpedMsg {
  @Override
  public void GasPumpedMsg(DataStore ds) {
    System.out.println("# of gallons pumped: " + ds.get_G());
    System.out.println(String.format("Total: $%.2f", ds.get_total()));
  }
}
