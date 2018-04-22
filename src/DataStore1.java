/*
  An actual DataStore for GasPump1 that contains fields and only implements methods (getters and setters) that
  are used by GasPump1. (this is a product of the Abstract Factory Pattern)
 */
public class DataStore1 extends DataStore {
  private float temp_a;
  private float temp_b;
  private String temp_p;
  private String pin;
  private float price;
  private int G;
  private float total;
  private float Rprice;
  private float Dprice;

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
  public String get_temp_p() {
    return temp_p;
  }

  @Override
  public void set_temp_p(String x) {
    temp_p = x;
  }

  @Override
  public String get_pin() {
    return pin;
  }

  @Override
  public void set_pin(String x) {
    pin = x;
  }

  @Override
  public float get_price() {
    return price;
  }

  @Override
  public void set_price(float x) {
    price = x;
  }

  @Override
  public int get_G() {
    return G;
  }

  @Override
  public void set_G(int x) {
    G = x;
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
  public float get_Rprice() {
    return Rprice;
  }

  @Override
  public void set_Rprice(float x) {
    Rprice = x;
  }

  @Override
  public float get_Dprice() {
    return Dprice;
  }

  @Override
  public void set_Dprice(float x) {
    Dprice = x;
  }

  // The remaining functions are only overridden because the base class declares them abstract

  @Override
  public float get_temp_c() {
    return 0;
  }

  @Override
  public void set_temp_c(float x) {

  }

  @Override
  public int get_temp_cash() {
    return 0;
  }

  @Override
  public void set_temp_cash(int x) {

  }

  @Override
  public float get_Sprice() {
    return 0;
  }

  @Override
  public void set_Sprice(float x) {

  }

  @Override
  public float get_Pprice() {
    return 0;
  }

  @Override
  public void set_Pprice(float x) {

  }

  @Override
  public float get_cash() {
    return 0;
  }

  @Override
  public void set_cash(float x) {

  }

  @Override
  public int get_L() {
    return 0;
  }

  @Override
  public void set_L(int x) {

  }
}
