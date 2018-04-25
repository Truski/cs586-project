/*
  (State Pattern) Concrete state for S3 in the MDAEFSM State Machine
*/
public class S3 extends State{
  @Override
  public void Activate() {
    System.out.println("Invalid operation in current state(S3)");
  }

  @Override
  public void Start() {
    System.out.println("Invalid operation in current state(S3)");
  }

  @Override
  public void PayType(int t) {
    System.out.println("Invalid operation in current state(S3)");
  }

  @Override
  public void Reject() {
    System.out.println("Invalid operation in current state(S3)");
  }

  @Override
  public void Cancel() {
    op.CancelMsg();
    op.ReturnCash();
    mdaefsm.setState(0);
  }

  @Override
  public void Approved() {
    System.out.println("Invalid operation in current state(S3)");
  }

  @Override
  public void StartPump() {
    System.out.println("Invalid operation in current state(S3)");
  }

  @Override
  public void Pump() {
    System.out.println("Invalid operation in current state(S3)");
  }

  @Override
  public void StopPump() {
    System.out.println("Invalid operation in current state(S3)");
  }

  @Override
  public void SelectGas(int g) {
    op.SetPrice(g, mdaefsm.getM());
  }

  @Override
  public void Receipt() {
    System.out.println("Invalid operation in current state(S3)");
  }

  @Override
  public void NoReceipt() {
    System.out.println("Invalid operation in current state(S3)");
  }

  @Override
  public void CorrectPin() {
    System.out.println("Invalid operation in current state(S3)");
  }

  @Override
  public void IncorrectPin() {
    System.out.println("Invalid operation in current state(S3)");
  }

  @Override
  public void Continue() {
    mdaefsm.setState(4);
  }
}
