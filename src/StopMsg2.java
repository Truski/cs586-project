/*
  (Strategy Pattern) Strategy containing the implementation for GasPump2's StopMsg action.
 */
public class StopMsg2 extends StopMsg {
  @Override
  public void StopMsg() {
    System.out.println("PUMP IS STOPPED");
    System.out.println("DO YOU WANT A RECEIPT?");
  }
}
