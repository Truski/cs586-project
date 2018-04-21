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
    return new StorePrices1();
  }

  @Override
  public PayMsg getPayMsg() {
    return new PayMsg1();
  }

  @Override
  public StoreCash getStoreCash() {
    return null;
  }

  @Override
  public DisplayMenu getDisplayMenu() {
    return new DisplayMenu1();
  }

  @Override
  public RejectMsg getRejectMsg() {
    return new RejectMsg1();
  }

  @Override
  public SetPrice getSetPrice() {
    return new SetPrice1();
  }

  @Override
  public ReadyMsg getReadyMsg() {
    return new ReadyMsg1();
  }

  @Override
  public SetInitialValues getSetInitialValues() {
    return new SetInitialValues1();
  }

  @Override
  public PumpGasUnit getPumpGasUnit() {
    return new PumpGasUnit1();
  }

  @Override
  public GasPumpedMsg getGasPumpedMsg() {
    return new GasPumpedMsg1();
  }

  @Override
  public StopMsg getStopMsg() {
    return new StopMsg1();
  }

  @Override
  public PrintReceipt getPrintReceipt() {
    return new PrintReceipt1();
  }

  @Override
  public CancelMsg getCancelMsg() {
    return new CancelMsg1();
  }

  @Override
  public ReturnCash getReturnCash() {
    return null;
  }

  @Override
  public WrongPinMsg getWrongPinMsg() {
    return new WrongPinMsg1();
  }

  @Override
  public StorePin getStorePin() {
    return new StorePin1();
  }

  @Override
  public EnterPinMsg getEnterPinMsg() {
    return new EnterPinMsg1();
  }

  @Override
  public InitializeData getInitializeData() {
    return new InitializeData1();
  }
}
