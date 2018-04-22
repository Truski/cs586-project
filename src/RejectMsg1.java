/*
  (Strategy Pattern) (Also a product in Abstract Factory Pattern) Strategy containing the implementation for GasPump1's RejectMsg action.
 */
public class RejectMsg1 extends RejectMsg {
  @Override
  public void RejectMsg() {
    System.out.println("Credit Card is not Approved");
    System.out.println("The Transaction is Cancelled");
  }
}
