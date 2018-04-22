/*
  (Abstract Factory Pattern) This class represents the Concrete Factory for GasPump2. It returns
  products (actions) that are GasPump2's versions. It also creates a DataStore2 if it has't been created before.
 */
public class ConcreteFactory2 extends AbstractFactory {
  @Override
  public DataStore getDataStore() {
    if(dataStore == null){
      dataStore = new DataStore2();
    }

    return dataStore;
  }

  @Override
  public StorePrices CreateStorePrices() {
    return new StorePrices2();
  }

  @Override
  public PayMsg CreatePayMsg() {
    return new PayMsg2();
  }

  @Override
  public StoreCash CreateStoreCash() {
    return new StoreCash2();
  }

  @Override
  public DisplayMenu CreateDisplayMenu() {
    return new DisplayMenu2();
  }

  @Override
  public RejectMsg CreateRejectMsg() {
    return new RejectMsg2();
  }

  @Override
  public SetPrice CreateSetPrice() {
    return new SetPrice2();
  }

  @Override
  public ReadyMsg CreateReadyMsg() {
    return new ReadyMsg2();
  }

  @Override
  public SetInitialValues CreateSetInitialValues() {
    return new SetInitialValues2();
  }

  @Override
  public PumpGasUnit CreatePumpGasUnit() {
    return new PumpGasUnit2();
  }

  @Override
  public GasPumpedMsg CreateGasPumpedMsg() {
    return new GasPumpedMsg2();
  }

  @Override
  public StopMsg CreateStopMsg() {
    return new StopMsg2();
  }

  @Override
  public PrintReceipt CreatePrintReceipt() {
    return new PrintReceipt2();
  }

  @Override
  public CancelMsg CreateCancelMsg() {
    return new CancelMsg2();
  }

  @Override
  public ReturnCash CreateReturnCash() {
    return new ReturnCash2();
  }

  @Override
  public WrongPinMsg CreateWrongPinMsg() {
    return new WrongPinMsg2();
  }

  @Override
  public StorePin CreateStorePin() {
    return new StorePin2();
  }

  @Override
  public EnterPinMsg CreateEnterPinMsg() {
    return new EnterPinMsg2();
  }

  @Override
  public InitializeData CreateInitializeData() {
    return new InitializeData2();
  }
}
