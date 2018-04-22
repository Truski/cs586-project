public abstract class AbstractFactory {
  DataStore dataStore;

  public abstract DataStore getDataStore();

  public abstract StorePrices CreateStorePrices();
  public abstract PayMsg CreatePayMsg();
  public abstract StoreCash CreateStoreCash();
  public abstract DisplayMenu CreateDisplayMenu();
  public abstract RejectMsg CreateRejectMsg();
  public abstract SetPrice CreateSetPrice();
  public abstract ReadyMsg CreateReadyMsg();
  public abstract SetInitialValues CreateSetInitialValues();
  public abstract PumpGasUnit CreatePumpGasUnit();
  public abstract GasPumpedMsg CreateGasPumpedMsg();
  public abstract StopMsg CreateStopMsg();
  public abstract PrintReceipt CreatePrintReceipt();
  public abstract CancelMsg CreateCancelMsg();
  public abstract ReturnCash CreateReturnCash();
  public abstract WrongPinMsg CreateWrongPinMsg();
  public abstract StorePin CreateStorePin();
  public abstract EnterPinMsg CreateEnterPinMsg();
  public abstract InitializeData CreateInitializeData();
}
