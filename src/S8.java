/*
  (State Pattern) Concrete state for S8 in the MDAEFSM State Machine
*/
public class S8 extends State{
  @Override
  public void Activate() {

  }

  @Override
  public void Start() {

  }

  @Override
  public void PayType(int t) {

  }

  @Override
  public void Reject() {

  }

  @Override
  public void Cancel() {

  }

  @Override
  public void Approved() {

  }

  @Override
  public void StartPump() {

  }

  @Override
  public void Pump() {

  }

  @Override
  public void StopPump() {

  }

  @Override
  public void SelectGas(int g) {

  }

  @Override
  public void Receipt() {

  }

  @Override
  public void NoReceipt() {

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

  }
}
