/*
  (State Pattern) Concrete state for S5 in the MDAEFSM State Machine
*/
public class S5 extends State{
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
    op.PumpGasUnit();
    op.GasPumpedMsg();
  }

  @Override
  public void StopPump() {
    op.StopMsg();
    mdaefsm.setState(6);
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
