public class ConcreteFactory1 extends AbstractFactory{
  @Override
  public DataStore getDataStore() {
    if(dataStore == null){
      dataStore = new DataStore1();
    }

    return dataStore;
  }

  @Override
  public StorePrices getStorePrices() {
    return null;
  }

  @Override
  public PayMsg getPayMsg() {
    return null;
  }

  @Override
  public StoreCash getStoreCash() {
    return null;
  }

  @Override
  public DisplayMenu getDisplayMenu() {
    return null;
  }

  @Override
  public RejectMsg getRejectMsg() {
    return null;
  }

  @Override
  public SetPrice getSetPrice() {
    return null;
  }

  @Override
  public ReadyMsg getReadyMsg() {
    return null;
  }

  @Override
  public SetInitialValues getSetInitialValues() {
    return null;
  }

  @Override
  public PumpGasUnit getPumpGasUnit() {
    return null;
  }

  @Override
  public GasPumpedMsg getGasPumpedMsg() {
    return null;
  }

  @Override
  public StopMsg getStopMsg() {
    return null;
  }

  @Override
  public PrintReceipt getPrintReceipt() {
    return null;
  }

  @Override
  public CancelMsg getCancelMsg() {
    return null;
  }

  @Override
  public ReturnCash getReturnCash() {
    return null;
  }

  @Override
  public WrongPinMsg getWrongPinMsg() {
    return null;
  }

  @Override
  public StorePin getStorePin() {
    return null;
  }

  @Override
  public EnterPinMsg getEnterPinMsg() {
    return null;
  }

  @Override
  public InitializeData getInitializeData() {
    return null;
  }
}
