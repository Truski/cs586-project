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

    storePrices = af.getStorePrices();
    payMsg = af.getPayMsg();
    storeCash = af.getStoreCash();
    displayMenu = af.getDisplayMenu();
    rejectMsg = af.getRejectMsg();
    setPrice = af.getSetPrice();
    readyMsg = af.getReadyMsg();
    setInitialValues = af.getSetInitialValues();
    pumpGasUnit = af.getPumpGasUnit();
    gasPumpedMsg = af.getGasPumpedMsg();
    stopMsg = af.getStopMsg();
    printReceipt = af.getPrintReceipt();
    cancelMsg = af.getCancelMsg();
    returnCash = af.getReturnCash();
    wrongPinMsg = af.getWrongPinMsg();
    storePin = af.getStorePin();
    enterPinMsg = af.getEnterPinMsg();
    initializeData = af.getInitializeData();
  }

  public void StorePrices() {
    storePrices.StorePrices(ds);
  }

  public void PayMsg() {
    payMsg.PayMsg();
  }

  public void StoreCash() {
    storeCash.StoreCash();
  }

  public void DisplayMenu() {
    displayMenu.DisplayMenu();
  }

  public void RejectMsg() {
    rejectMsg.RejectMsg();
  }

  public void SetPrice(int g, int M){
    setPrice.SetPrice(g, M);
  }

  public void ReadyMsg(){
    readyMsg.ReadyMsg();
  }

  public void SetInitialValues(){
    setInitialValues.SetInitialValues();
  }

  public void PumpGasUnit(){
    pumpGasUnit.PumpGasUnit();
  }

  public void GasPumpedMsg() {
    gasPumpedMsg.GasPumpedMsg();
  }

  public void StopMsg() {
    stopMsg.StopMsg();
  }

  public void PrintReceipt() {
    printReceipt.PrintReceipt();
  }

  public void CancelMsg() {
    cancelMsg.CancelMsg();
  }

  public void ReturnCash() {
    returnCash.ReturnCash();
  }

  public void WrongPinMsg() {
    wrongPinMsg.WrongPinMsg();
  }

  public void StorePin() {
    storePin.StorePin();
  }

  public void EnterPinMsg() {
    enterPinMsg.EnterPinMsg();
  }

  public void InitializeData() {
    initializeData.InitializeData();
  }
}
