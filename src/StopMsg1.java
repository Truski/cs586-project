/*
  (Strategy Pattern) Strategy containing the implementation for GasPump1's StopMsg action.
 */
public class StopMsg1 extends StopMsg {
  @Override
  public void StopMsg() {
    System.out.println("Pump is stopped.");
  }
}
