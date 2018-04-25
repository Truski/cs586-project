/*
  (State Pattern) The abstract base class. It has a reference to the output processor
  to perform actions, as well as the MDAEFSM to change states and refer to data
  (since it is decentralized solution)
  For example, MDAEFSM get's an Activate event, and it is in state 7, it will forward the activate event to S7 object
  S7 object will do what is in the MDAEFSM model - in this case S7 is the initial state, so it will activate
  the gas pump.
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
