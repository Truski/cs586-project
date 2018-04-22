/*
  (Strategy Pattern) Strategy containing the implementation for GasPump2's RejectMsg action.
 */
public class RejectMsg2 extends RejectMsg {
  @Override
  public void RejectMsg() {
    System.out.println("THE CREDIT CARD IS NOT APPROVED");
  }
}
