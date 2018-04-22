/*
  The abstract base class for Data Stores used across the system.
  Abstract Factory Pattern creates the proper Data Stores for the respective
  GasPump system.
 */

public abstract class DataStore {
  public abstract float get_temp_a();
  public abstract void set_temp_a(float x);
  public abstract float get_temp_b();
  public abstract void set_temp_b(float x);
  public abstract String get_temp_p();
  public abstract void set_temp_p(String x);
  public abstract String get_pin();
  public abstract void set_pin(String x);
  public abstract float get_price();
  public abstract void set_price(float x);
  public abstract int get_G();
  public abstract void set_G(int x);
  public abstract float get_total();
  public abstract void set_total(float x);
  public abstract float get_Rprice();
  public abstract void set_Rprice(float x);
  public abstract float get_Dprice();
  public abstract void set_Dprice(float x);
  public abstract float get_temp_c();
  public abstract void set_temp_c(float x);
  public abstract int get_temp_cash();
  public abstract void set_temp_cash(int x);
  public abstract float get_Sprice();
  public abstract void set_Sprice(float x);
  public abstract float get_Pprice();
  public abstract void set_Pprice(float x);
  public abstract float get_cash();
  public abstract void set_cash(float x);
  public abstract int get_L();
  public abstract void set_L(int x);
}
