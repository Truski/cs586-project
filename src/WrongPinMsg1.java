/*
  (Strategy Pattern) (Also a product in Abstract Factory Pattern) Strategy containing the implementation for GasPump1's WrongPinMsg action.
 */
public class WrongPinMsg1 extends WrongPinMsg {
  @Override
  public void WrongPinMsg() {
    System.out.println("Wrong pin entered!");
    System.out.println("The Transaction is Cancelled");
  }
}
