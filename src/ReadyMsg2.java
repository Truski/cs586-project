/*
  (Strategy Pattern) (Also a product in Abstract Factory Pattern) Strategy containing the implementation for GasPump2's ReadyMsg action.
 */
public class ReadyMsg2 extends ReadyMsg {
  @Override
  public void ReadyMsg() {
    System.out.println("START PUMPING:");
  }
}
