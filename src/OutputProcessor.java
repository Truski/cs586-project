/*
  The OutputProcessor of the MDA Architecture. Contains all the strategies that may be different
  for each GasPump (Strategy Pattern) and is initialized by the Abstract Factory Pattern. States call
  the OP's methods
 */
public class OutputProcessor {
  private DataStore ds;

  private StorePrices storePrices;
  private PayMsg payMsg;
  private StoreCash storeCash;
  private DisplayMenu displayMenu;
  private RejectMsg rejectMsg;
  private SetPrice setPrice;
  private ReadyMsg readyMsg;
  private SetInitialValues setInitialValues;
  private PumpGasUnit pumpGasUnit;
  private GasPumpedMsg gasPumpedMsg;
  private StopMsg stopMsg;
  private PrintReceipt printReceipt;
  private CancelMsg cancelMsg;
  private ReturnCash returnCash;
  private WrongPinMsg wrongPinMsg;
  private StorePin storePin;
  private EnterPinMsg enterPinMsg;
  private InitializeData initializeData;

  public void Initialize(AbstractFactory af){
    ds = af.getDataStore();

    storePrices = af.CreateStorePrices();
    payMsg = af.CreatePayMsg();
    storeCash = af.CreateStoreCash();
    displayMenu = af.CreateDisplayMenu();
    rejectMsg = af.CreateRejectMsg();
    setPrice = af.CreateSetPrice();
    readyMsg = af.CreateReadyMsg();
    setInitialValues = af.CreateSetInitialValues();
    pumpGasUnit = af.CreatePumpGasUnit();
    gasPumpedMsg = af.CreateGasPumpedMsg();
    stopMsg = af.CreateStopMsg();
    printReceipt = af.CreatePrintReceipt();
    cancelMsg = af.CreateCancelMsg();
    returnCash = af.CreateReturnCash();
    wrongPinMsg = af.CreateWrongPinMsg();
    storePin = af.CreateStorePin();
    enterPinMsg = af.CreateEnterPinMsg();
    initializeData = af.CreateInitializeData();
  }

  public void StorePrices() {
    storePrices.StorePrices(ds);
  }

  public void PayMsg() {
    payMsg.PayMsg();
  }

  public void StoreCash() {
    storeCash.StoreCash(ds);
  }

  public void DisplayMenu() {
    displayMenu.DisplayMenu();
  }

  public void RejectMsg() {
    rejectMsg.RejectMsg();
  }

  public void SetPrice(int g, int M){
    setPrice.SetPrice(ds, g, M);
  }

  public void ReadyMsg(){
    readyMsg.ReadyMsg();
  }

  public void SetInitialValues(){
    setInitialValues.SetInitialValues(ds);
  }

  public void PumpGasUnit(){
    pumpGasUnit.PumpGasUnit(ds);
  }

  public void GasPumpedMsg() {
    gasPumpedMsg.GasPumpedMsg(ds);
  }

  public void StopMsg() {
    stopMsg.StopMsg();
  }

  public void PrintReceipt() {
    printReceipt.PrintReceipt(ds);
  }

  public void CancelMsg() {
    cancelMsg.CancelMsg();
  }

  public void ReturnCash() {
    returnCash.ReturnCash(ds);
  }

  public void WrongPinMsg() {
    wrongPinMsg.WrongPinMsg();
  }

  public void StorePin() {
    storePin.StorePin(ds);
  }

  public void EnterPinMsg() {
    enterPinMsg.EnterPinMsg();
  }

  public void InitializeData() {
    initializeData.InitializeData(ds);
  }
}
