/*
  (Strategy Pattern) (Also a product in Abstract Factory Pattern) Strategy containing the implementation for GasPump2's ReturnCash action.
 */
public class ReturnCash2 extends ReturnCash {
  @Override
  public void ReturnCash(DataStore ds) {
    float returned;
    if(ds.get_cash() > 0){
      returned = ds.get_cash() - ds.get_price() * ds.get_L();
    } else {
      returned = 0;
    }
    System.out.println(String.format("RETURN $%.2f of CASH", returned));
  }
}
