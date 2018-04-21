public class ConcreteFactory2 extends AbstractFactory {
  @Override
  public DataStore getDataStore() {
    if(dataStore == null){
      dataStore = new DataStore2();
    }

    return dataStore;
  }

  @Override
  public StorePrices getStorePrices() {
    return new StorePrices2();
  }

  @Override
  public PayMsg getPayMsg() {
    return new PayMsg2();
  }

  @Override
  public StoreCash getStoreCash() {
    return new StoreCash2();
  }

  @Override
  public DisplayMenu getDisplayMenu() {
    return new DisplayMenu2();
  }

  @Override
  public RejectMsg getRejectMsg() {
    return new RejectMsg2();
  }

  @Override
  public SetPrice getSetPrice() {
    return new SetPrice2();
  }

  @Override
  public ReadyMsg getReadyMsg() {
    return new ReadyMsg2();
  }

  @Override
  public SetInitialValues getSetInitialValues() {
    return new SetInitialValues2();
  }

  @Override
  public PumpGasUnit getPumpGasUnit() {
    return new PumpGasUnit2();
  }

  @Override
  public GasPumpedMsg getGasPumpedMsg() {
    return new GasPumpedMsg2();
  }

  @Override
  public StopMsg getStopMsg() {
    return new StopMsg2();
  }

  @Override
  public PrintReceipt getPrintReceipt() {
    return new PrintReceipt2();
  }

  @Override
  public CancelMsg getCancelMsg() {
    return new CancelMsg2();
  }

  @Override
  public ReturnCash getReturnCash() {
    return new ReturnCash2();
  }

  @Override
  public WrongPinMsg getWrongPinMsg() {
    return new WrongPinMsg2();
  }

  @Override
  public StorePin getStorePin() {
    return new StorePin2();
  }

  @Override
  public EnterPinMsg getEnterPinMsg() {
    return new EnterPinMsg2();
  }

  @Override
  public InitializeData getInitializeData() {
    return new InitializeData2();
  }
}
