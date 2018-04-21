public abstract class State {
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
}
