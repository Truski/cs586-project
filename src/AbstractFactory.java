public abstract class AbstractFactory {
  DataStore dataStore;

  public abstract DataStore getDataStore();

  public abstract StorePrices getStorePrices();
  public abstract PayMsg getPayMsg();
  public abstract StoreCash getStoreCash();
  public abstract DisplayMenu getDisplayMenu();
  public abstract RejectMsg getRejectMsg();
  public abstract SetPrice getSetPrice();
  public abstract ReadyMsg getReadyMsg();
  public abstract SetInitialValues getSetInitialValues();
  public abstract PumpGasUnit getPumpGasUnit();
  public abstract GasPumpedMsg getGasPumpedMsg();
  public abstract StopMsg getStopMsg();
  public abstract PrintReceipt getPrintReceipt();
  public abstract CancelMsg getCancelMsg();
  public abstract ReturnCash getReturnCash();
  public abstract WrongPinMsg getWrongPinMsg();
  public abstract StorePin getStorePin();
  public abstract EnterPinMsg getEnterPinMsg();
  public abstract InitializeData getInitializeData();
}
