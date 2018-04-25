/*
  This class represents the PlatForm Specific Model for GasPump1. In initialization, it creates
  a Concrete Factory 1, part of the Abstract Factory Pattern, so that it could initialize the MDAEFSM's OP and
  get the data store. Contains methods that are called by the driver program.
 */
public class GasPump1 {
  private DataStore d;
  private MDAEFSM m;

  public void Initialize(AbstractFactory af){
    d = af.getDataStore();
    m = new MDAEFSM();
    m.Initialize(af);
  }

  public void Activate(float a, float b){
    if(a > 0 && b > 0){
      d.set_temp_a(a);
      d.set_temp_b(b);
      m.Activate();
    }
  }

  public void Start() {
    m.Start();
  }

  public void PayCredit() {
    m.PayType(1);
  }

  public void Reject() {
    m.Reject();
  }

  public void PayDebit(String p) {
    d.set_temp_p(p);
    m.PayType(3);
  }

  public void Pin(String x) {
    if (d.get_pin().equals(x)){
      m.CorrectPin();
    } else {
      m.IncorrectPin();
    }
  }

  public void Cancel() {
    m.Cancel();
  }

  public void Approved() {
    m.Approved();
  }

  public void Diesel() {
    m.SelectGas(4);
  }

  public void Regular() {
    m.SelectGas(1);
  }

  public void StartPump() {
    if(d.get_price() > 0) {
      m.Continue();
      m.StartPump();
    }
  }

  public void PumpGallon() {
    m.Pump();
  }

  public void StopPump() {
    m.StopPump();
    m.Receipt();
  }

  public void FullTank() {
    m.StopPump();
    m.Receipt();
  }
}
