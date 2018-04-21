public class GasPump2 {
  DataStore d;
  MDAEFSM m;

  public GasPump2() {
    d = new DataStore2();
  }

  public void Activate(float a, float b, float c) {
    if (a > 0 && b > 0 && c > 0) {
      d.set_temp_a(a);
      d.set_temp_b(b);
      d.set_temp_c(c);
      m.Activate();
    }
  }

  public void PayCash(int c) {
    if(c > 0) {
      d.set_temp_cash(c);
      m.Start();
      m.PayType(2);
    }
  }

  public void PayCredit() {
    m.Start();
    m.PayType(1);
  }

  public void Reject() {
    m.Reject();
  }

  public void Approved() {
    m.Approved();
  }

  public void Cancel() {
    m.Cancel();
  }

  public void Super() {
    m.SelectGas(2);
    m.Continue();
  }

  public void Premium() {
    m.SelectGas(3);
    m.Continue();
  }

  public void Regular() {
    m.SelectGas(1);
    m.Continue();
  }

  public void StartPump() {
    m.StartPump();
  }

  public void PumpLiter() {
    float cash = d.get_cash();
    float price = d.get_price();
    float L = d.get_L();
    if(cash > 0 && cash < price * (L + 1)) {
      m.StopPump();
    } else {
      m.Pump();
    }
  }

  public void Stop() {
    m.StopPump();
  }

  public void Receipt() {
    m.Receipt();
  }

  public void NoReceipt() {
    m.NoReceipt();
  }
}