public class MDAEFSM {
  private State[] states;
  private State state;
  private int M;

  public void Initialize(AbstractFactory af) {
    OutputProcessor op = new OutputProcessor();
    op.Initialize(af);
    states = new State[9];
    states[0] = new S0();
    states[1] = new S1();
    states[2] = new S2();
    states[3] = new S3();
    states[4] = new S4();
    states[5] = new S5();
    states[6] = new S6();
    states[7] = new S7();
    states[8] = new S8();
    state = states[0];

    for (State s : states) {
      s.setMDAEFSM(this);
      s.setOP(op);
    }
  }

  public void setM(int m) {
    M = m;
  }

  public void Activate(){
    state.Activate();
  }

  public void Start(){
    state.Start();
  }

  public void PayType(int t){
    state.PayType(t);
  }

  public void Reject(){
    state.Reject();
  }

  public void Cancel(){
    state.Cancel();
  }

  public void Approved(){
    state.Approved();
  }

  public void StartPump(){
    state.StartPump();
  }

  public void Pump(){
    state.Pump();
  }

  public void StopPump(){
    state.StopPump();
  }

  public void SelectGas(int g){
    state.SelectGas(g);
  }

  public void Receipt(){
    state.Receipt();
  }

  public void NoReceipt(){
    state.NoReceipt();
  }

  public void CorrectPin(){
    state.CorrectPin();
  }

  public void IncorrectPin(){
    state.IncorrectPin();
  }

  public void Continue(){
    state.Continue();
  }

  public void setState(int s){
    state = states[s];
  }
}
