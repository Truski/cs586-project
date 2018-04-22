/*
  (State Pattern) The abstract base class. It has a reference to the output processor
  to perform actions, as well as the MDAEFSM to change states and refer to data
  (since it is decentralized solution)
 */
public abstract class State {
  OutputProcessor op;
  MDAEFSM mdaefsm;

  public abstract void Activate();
  public abstract void Start();
  public abstract void PayType(int t);
  public abstract void Reject();
  public abstract void Cancel();
  public abstract void Approved();
  public abstract void StartPump();
  public abstract void Pump();
  public abstract void StopPump();
  public abstract void SelectGas(int g);
  public abstract void Receipt();
  public abstract void NoReceipt();
  public abstract void CorrectPin();
  public abstract void IncorrectPin();
  public abstract void Continue();

  public void setOP(OutputProcessor op){
    this.op = op;
  }

  public void setMDAEFSM(MDAEFSM mdaefsm){
    this.mdaefsm = mdaefsm;
  }
}
