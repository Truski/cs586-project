/*
  (State Pattern) Concrete state for S4 in the MDAEFSM State Machine
*/
public class S4 extends State{
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
    op.SetInitialValues();
    op.ReadyMsg();
    mdaefsm.setState(5);
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

  }

  @Override
  public void IncorrectPin() {

  }

  @Override
  public void Continue() {

  }
}
