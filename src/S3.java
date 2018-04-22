/*
  (State Pattern) Concrete state for S3 in the MDAEFSM State Machine
*/
public class S3 extends State{
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
    op.CancelMsg();
    op.ReturnCash();
    mdaefsm.setState(0);
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
    op.SetPrice(g, mdaefsm.getM());
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
    mdaefsm.setState(4);
  }
}
