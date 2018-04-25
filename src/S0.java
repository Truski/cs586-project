/*
  (State Pattern) Concrete state for S0 in the MDAEFSM State Machine
*/
public class S0 extends State{

  @Override
  public void Activate() {
    System.out.println("Invalid operation in current state(S0)");
  }

  @Override
  public void Start() {
    op.PayMsg();
    op.InitializeData();
    mdaefsm.setM(1);
    mdaefsm.setState(1);
  }

  @Override
  public void PayType(int t) {
    System.out.println("Invalid operation in current state(S0)");
  }

  @Override
  public void Reject() {
    System.out.println("Invalid operation in current state(S0)");
  }

  @Override
  public void Cancel() {
    System.out.println("Invalid operation in current state(S0)");
  }

  @Override
  public void Approved() {
    System.out.println("Invalid operation in current state(S0)");
  }

  @Override
  public void StartPump() {
    System.out.println("Invalid operation in current state(S0)");
  }

  @Override
  public void Pump() {
    System.out.println("Invalid operation in current state(S0)");
  }

  @Override
  public void StopPump() {
    System.out.println("Invalid operation in current state(S0)");
  }

  @Override
  public void SelectGas(int g) {
    System.out.println("Invalid operation in current state(S0)");
  }

  @Override
  public void Receipt() {
    System.out.println("Invalid operation in current state(S0)");
  }

  @Override
  public void NoReceipt() {
    System.out.println("Invalid operation in current state(S0)");
  }

  @Override
  public void CorrectPin() {
    System.out.println("Invalid operation in current state(S0)");
  }

  @Override
  public void IncorrectPin() {
    System.out.println("Invalid operation in current state(S0)");
  }

  @Override
  public void Continue() {
    System.out.println("Invalid operation in current state(S0)");
  }
}
