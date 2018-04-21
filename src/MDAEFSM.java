public class MDAEFSM {
  private OutputProcessor op;
  private State[] states;
  private int M;
  public MDAEFSM(){
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
  }
}
