/*
  (Strategy Pattern) (Also a product in Abstract Factory Pattern) Strategy containing the implementation for GasPump1's EnterPinMsg action.
 */
public class EnterPinMsg1 extends EnterPinMsg {
  @Override
  public void EnterPinMsg() {
    System.out.println("Please enter debit pin");
  }
}
