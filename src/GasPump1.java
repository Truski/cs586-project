public class GasPump1 {
  DataStore d;
  MDAEFSM m;
  public GasPump1(){
    d = new DataStore1();
  }

  public void Activate(float a, float b){
    if(a > 0 && b > 0){
      d.set_temp_a(a);
      d.set_temp_b(b);

    }
  }
}
