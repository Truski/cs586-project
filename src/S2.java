/*
  (State Pattern) Concrete state for S2 in the MDAEFSM State Machine
*/
public class S2 extends State{
  @Override
  public void Activate() {
    System.out.println("Invalid operation in current state(S2)");
  }

  @Override
  public void Start() {
    System.out.println("Invalid operation in current state(S2)");
  }

  @Override
  public void PayType(int t) {
    System.out.println("Invalid operation in current state(S2)");
  }

  @Override
  public void Reject() {
    op.RejectMsg();
    mdaefsm.setState(0);
  }

  @Override
  public void Cancel() {
    System.out.println("Invalid operation in current state(S2)");
  }

  @Override
  public void Approved() {
    op.DisplayMenu();
    mdaefsm.setState(3);
  }

  @Override
  public void StartPump() {
    System.out.println("Invalid operation in current state(S2)");
  }

  @Override
  public void Pump() {
    System.out.println("Invalid operation in current state(S2)");
  }

  @Override
  public void StopPump() {
    System.out.println("Invalid operation in current state(S2)");
  }

  @Override
  public void SelectGas(int g) {
    System.out.println("Invalid operation in current state(S2)");
  }

  @Override
  public void Receipt() {
    System.out.println("Invalid operation in current state(S2)");
  }

  @Override
  public void NoReceipt() {
    System.out.println("Invalid operation in current state(S2)");
  }

  @Override
  public void CorrectPin() {
    System.out.println("Invalid operation in current state(S2)");
  }

  @Override
  public void IncorrectPin() {
    System.out.println("Invalid operation in current state(S2)");
  }

  @Override
  public void Continue() {
    System.out.println("Invalid operation in current state(S2)");
  }
}
