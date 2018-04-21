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

  public void StorePrices() {
    storePrices.StorePrices();
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
