/*
  (State Pattern) Concrete state for S1 in the MDAEFSM State Machine
*/
public class S1 extends State{
  @Override
  public void Activate() {
    System.out.println("Invalid operation in current state(S1)");
  }

  @Override
  public void Start() {
    System.out.println("Invalid operation in current state(S1)");
  }

  @Override
  public void PayType(int t) {
    if(t == 1){
      mdaefsm.setState(2);
    } else if (t == 2) {
      op.StoreCash();
      op.DisplayMenu();
      mdaefsm.setM(0);
      mdaefsm.setState(3);
    } else if (t == 3) {
      op.EnterPinMsg();
      op.StorePin();
      mdaefsm.setState(8);
    }
  }

  @Override
  public void Reject() {
    System.out.println("Invalid operation in current state(S1)");
  }

  @Override
  public void Cancel() {
    System.out.println("Invalid operation in current state(S1)");
  }

  @Override
  public void Approved() {
    System.out.println("Invalid operation in current state(S1)");
  }

  @Override
  public void StartPump() {
    System.out.println("Invalid operation in current state(S1)");
  }

  @Override
  public void Pump() {
    System.out.println("Invalid operation in current state(S1)");
  }

  @Override
  public void StopPump() {
    System.out.println("Invalid operation in current state(S1)");
  }

  @Override
  public void SelectGas(int g) {
    System.out.println("Invalid operation in current state(S1)");
  }

  @Override
  public void Receipt() {
    System.out.println("Invalid operation in current state(S1)");
  }

  @Override
  public void NoReceipt() {
    System.out.println("Invalid operation in current state(S1)");
  }

  @Override
  public void CorrectPin() {
    System.out.println("Invalid operation in current state(S1)");
  }

  @Override
  public void IncorrectPin() {
    System.out.println("Invalid operation in current state(S1)");
  }

  @Override
  public void Continue() {
    System.out.println("Invalid operation in current state(S1)");
  }
}
