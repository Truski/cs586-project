/*
  An actual DataStore for GasPump2 that contains fields and only implements methods (getters and setters) that
  are used by GasPump2. (this is a product of the Abstract Factory Pattern)
 */
public class DataStore2 extends DataStore {
  private float temp_a;
  private float temp_b;
  private float temp_c;
  private int temp_cash;
  private float Sprice;
  private float Rprice;
  private float Pprice;
  private float cash;
  private float total;
  private int L;
  private float price;

  @Override
  public float get_temp_a() {
    return temp_a;
  }

  @Override
  public void set_temp_a(float x) {
    temp_a = x;
  }

  @Override
  public float get_temp_b() {
    return temp_b;
  }

  @Override
  public void set_temp_b(float x) {
    temp_b = x;
  }

  @Override
  public float get_temp_c() {
    return temp_c;
  }

  @Override
  public void set_temp_c(float x) {
    temp_c = x;
  }

  @Override
  public int get_temp_cash() {
    return temp_cash;
  }

  @Override
  public void set_temp_cash(int x) {
    temp_cash = x;
  }

  @Override
  public float get_Sprice() {
    return Sprice;
  }

  @Override
  public void set_Sprice(float x) {
    Sprice = x;
  }

  @Override
  public float get_Rprice() {
    return Rprice;
  }

  @Override
  public void set_Rprice(float x) {
    Rprice = x;
  }

  @Override
  public float get_Pprice() {
    return Pprice;
  }

  @Override
  public void set_Pprice(float x) {
    Pprice = x;
  }

  @Override
  public float get_cash() {
    return cash;
  }

  @Override
  public void set_cash(float x) {
    cash = x;
  }

  @Override
  public float get_total() {
    return total;
  }

  @Override
  public void set_total(float x) {
    total = x;
  }

  @Override
  public int get_L() {
    return L;
  }

  @Override
  public void set_L(int x) {
    L = x;
  }

  @Override
  public float get_price() {
    return price;
  }

  @Override
  public void set_price(float x) {
    price = x;
  }

  // The remaining functions are only overridden because the base class declares them abstract

  @Override
  public String get_temp_p() {
    return null;
  }

  @Override
  public void set_temp_p(String x) {

  }

  @Override
  public String get_pin() {
    return null;
  }

  @Override
  public void set_pin(String x) {

  }

  @Override
  public int get_G() {
    return 0;
  }

  @Override
  public void set_G(int x) {

  }

  @Override
  public float get_Dprice() {
    return 0;
  }

  @Override
  public void set_Dprice(float x) {

  }
}
