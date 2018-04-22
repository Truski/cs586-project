public class ConcreteFactory1 extends AbstractFactory{
  @Override
  public DataStore getDataStore() {
    if(dataStore == null){
      dataStore = new DataStore1();
    }

    return dataStore;
  }

  @Override
  public StorePrices CreateStorePrices() {
    return new StorePrices1();
  }

  @Override
  public PayMsg CreatePayMsg() {
    return new PayMsg1();
  }

  @Override
  public StoreCash CreateStoreCash() {
    return new StoreCash1();
  }

  @Override
  public DisplayMenu CreateDisplayMenu() {
    return new DisplayMenu1();
  }

  @Override
  public RejectMsg CreateRejectMsg() {
    return new RejectMsg1();
  }

  @Override
  public SetPrice CreateSetPrice() {
    return new SetPrice1();
  }

  @Override
  public ReadyMsg CreateReadyMsg() {
    return new ReadyMsg1();
  }

  @Override
  public SetInitialValues CreateSetInitialValues() {
    return new SetInitialValues1();
  }

  @Override
  public PumpGasUnit CreatePumpGasUnit() {
    return new PumpGasUnit1();
  }

  @Override
  public GasPumpedMsg CreateGasPumpedMsg() {
    return new GasPumpedMsg1();
  }

  @Override
  public StopMsg CreateStopMsg() {
    return new StopMsg1();
  }

  @Override
  public PrintReceipt CreatePrintReceipt() {
    return new PrintReceipt1();
  }

  @Override
  public CancelMsg CreateCancelMsg() {
    return new CancelMsg1();
  }

  @Override
  public ReturnCash CreateReturnCash() {
    return new ReturnCash1();
  }

  @Override
  public WrongPinMsg CreateWrongPinMsg() {
    return new WrongPinMsg1();
  }

  @Override
  public StorePin CreateStorePin() {
    return new StorePin1();
  }

  @Override
  public EnterPinMsg CreateEnterPinMsg() {
    return new EnterPinMsg1();
  }

  @Override
  public InitializeData CreateInitializeData() {
    return new InitializeData1();
  }
}
