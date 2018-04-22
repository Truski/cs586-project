/*
  (Strategy Pattern) Strategy containing the implementation for GasPump2's CancelMsg action.
 */
public class CancelMsg2 extends CancelMsg {
  @Override
  public void CancelMsg() {
    System.out.println("THE TRANSACTION IS CANCELLED");
  }
}
