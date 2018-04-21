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
}
