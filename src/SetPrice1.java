/*
  (Strategy Pattern) Strategy containing the implementation for GasPump1's SetPrice action.
 */
public class SetPrice1 extends SetPrice {
  @Override
  public void SetPrice(DataStore ds, int g, int M) {
    if(g == 1){
      System.out.println("Regular Gas is selected:");
      ds.set_price(ds.get_Rprice());
    } else if(g == 4){
      System.out.println("Diesel Gas is selected:");
      ds.set_price(ds.get_Dprice());
    }
  }
}
