/*
  (Strategy Pattern) Strategy containing the implementation for GasPump1's PayMsg action.
 */
public class PayMsg1 extends PayMsg {
  @Override
  public void PayMsg() {
    System.out.println("Pay by Credit or Debit?");
  }
}
