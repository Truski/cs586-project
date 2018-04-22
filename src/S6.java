/*
  (State Pattern) Concrete state for S6 in the MDAEFSM State Machine
*/
public class S6 extends State{
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

  }

  @Override
  public void IncorrectPin() {

  }

  @Override
  public void Continue() {

  }
}
