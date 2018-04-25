/*
  (State Pattern) Concrete state for S6 in the MDAEFSM State Machine
*/
public class S6 extends State{
  @Override
  public void Activate() {
    System.out.println("Invalid operation in current state(S6)");
  }

  @Override
  public void Start() {
    System.out.println("Invalid operation in current state(S6)");
  }

  @Override
  public void PayType(int t) {
    System.out.println("Invalid operation in current state(S6)");
  }

  @Override
  public void Reject() {
    System.out.println("Invalid operation in current state(S6)");
  }

  @Override
  public void Cancel() {
    System.out.println("Invalid operation in current state(S6)");
  }

  @Override
  public void Approved() {
    System.out.println("Invalid operation in current state(S6)");
  }

  @Override
  public void StartPump() {
    System.out.println("Invalid operation in current state(S6)");
  }

  @Override
  public void Pump() {
    System.out.println("Invalid operation in current state(S6)");
  }

  @Override
  public void StopPump() {
    System.out.println("Invalid operation in current state(S6)");
  }

  @Override
  public void SelectGas(int g) {
    System.out.println("Invalid operation in current state(S6)");
  }

  @Override
  public void Receipt() {
    op.PrintReceipt();
    op.ReturnCash();
    mdaefsm.setState(0);
  }

  @Override
  public void NoReceipt() {
    op.ReturnCash();
    mdaefsm.setState(0);
  }

  @Override
  public void CorrectPin() {
    System.out.println("Invalid operation in current state(S6)");
  }

  @Override
  public void IncorrectPin() {
    System.out.println("Invalid operation in current state(S6)");
  }

  @Override
  public void Continue() {
    System.out.println("Invalid operation in current state(S6)");
  }
}
