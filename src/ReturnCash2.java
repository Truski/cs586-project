public class ReturnCash2 extends ReturnCash {
  @Override
  public void ReturnCash(DataStore ds) {
    float returned = ds.get_cash() - ds.get_price() * ds.get_L();
    System.out.println("RETURN $" + returned + " of CASH");
  }
}
