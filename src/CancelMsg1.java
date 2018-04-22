/*
  (Strategy Pattern) (Also a product in Abstract Factory Pattern) Strategy containing the implementation for GasPump1's CancelMsg action.
 */
public class CancelMsg1 extends CancelMsg {
  @Override
  public void CancelMsg() {
    System.out.println("The Transaction is cancelled");
  }
}
