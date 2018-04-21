public class SetPrice2 extends SetPrice {
  @Override
  public void SetPrice(DataStore ds, int g, int M) {
    if(g == 1){
      System.out.println("REGULAR GAS IS SELECTED:");
      ds.set_price(ds.get_Rprice());
    } else if (g == 2){
      System.out.println("SUPER GAS IS SELECTED:");
      ds.set_price(ds.get_Sprice());
    } else if (g == 3){
      System.out.println("PREMIUM GAS IS SELECTED:");
      ds.set_price(ds.get_Pprice());
    }
    if(M == 1){
      ds.set_price(ds.get_price() * 1.1f);
    }
  }
}
