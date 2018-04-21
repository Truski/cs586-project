public class S1 extends State{
  @Override
  public void Activate() {

  }

  @Override
  public void Start() {

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

  }

  @Override
  public void IncorrectPin() {

  }

  @Override
  public void Continue() {

  }
}
