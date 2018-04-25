/*
  (State Pattern) Concrete state for S8 in the MDAEFSM State Machine
*/
public class S8 extends State{
  @Override
  public void Activate() {
    System.out.println("Invalid operation in current state(S8)");
  }

  @Override
  public void Start() {
    System.out.println("Invalid operation in current state(S8)");
  }

  @Override
  public void PayType(int t) {
    System.out.println("Invalid operation in current state(S8)");
  }

  @Override
  public void Reject() {
    System.out.println("Invalid operation in current state(S8)");
  }

  @Override
  public void Cancel() {
    System.out.println("Invalid operation in current state(S8)");
  }

  @Override
  public void Approved() {
    System.out.println("Invalid operation in current state(S8)");
  }

  @Override
  public void StartPump() {
    System.out.println("Invalid operation in current state(S8)");
  }

  @Override
  public void Pump() {
    System.out.println("Invalid operation in current state(S8)");
  }

  @Override
  public void StopPump() {
    System.out.println("Invalid operation in current state(S8)");
  }

  @Override
  public void SelectGas(int g) {
    System.out.println("Invalid operation in current state(S8)");
  }

  @Override
  public void Receipt() {
    System.out.println("Invalid operation in current state(S8)");
  }

  @Override
  public void NoReceipt() {
    System.out.println("Invalid operation in current state(S8)");
  }

  @Override
  public void CorrectPin() {
    op.DisplayMenu();
    mdaefsm.setState(3);
  }

  @Override
  public void IncorrectPin() {
    op.WrongPinMsg();
    mdaefsm.setState(0);
  }

  @Override
  public void Continue() {
    System.out.println("Invalid operation in current state(S8)");
  }
}
