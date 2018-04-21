import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Driver {
  public static void main(String[] args) {

    System.out.println("\t\tCS 586 - Spring 2018");
    System.out.println("\t\tProject Implementation");
    System.out.println();
    System.out.println("\tSelect GP-1 or GP-2");
    System.out.println("1. GP-1");
    System.out.println("2. GP-2");

    Scanner in = new Scanner(System.in);
    char ch = in.next().charAt(0);
    if(ch == '1'){
      float a, b;
      String s;
      GasPump1 gp1 = new GasPump1();

      System.out.println("\t\t\t\t\tGasPump-1");
      System.out.println("\t\tMENU of Operations");
      System.out.println("\t\t0. Activate(float, float)");
      System.out.println("\t\t1. Start()");
      System.out.println("\t\t2. PayCredit()");
      System.out.println("\t\t3. Reject()");
      System.out.println("\t\t4. PayDebit(string");
      System.out.println("\t\t5. Pin(string)");
      System.out.println("\t\t6. Cancel()");
      System.out.println("\t\t7. Approved()");
      System.out.println("\t\t8. Diesel()");
      System.out.println("\t\t9. Regular()");
      System.out.println("\t\ta. StartPump()");
      System.out.println("\t\tb. PumpGallon()");
      System.out.println("\t\tc. StopPump()");
      System.out.println("\t\td. FullTank()");
      System.out.println("\t\tq. Quit the program");
      System.out.println("\t\tPlease make a note of these operations");
      System.out.println("\t\tGasPump-1 Execution");
      while(ch != 'q'){
        System.out.println(" Select Operation");
        System.out.println("0-Activate,1-Start,2-PayCredit,3-Reject,4-PayDebit,5-Pin,6-Cancel,7-Approved");
        System.out.println("8-Diesel,9-Regular,a-StartPump,b-PumpGallon,c-StopPump,d-FullTank, q-quit");
        ch = in.next().charAt(0);
        switch(ch){
          case '0': { // Activate
            System.out.println("Operation: Activate(float a, float b)");
            System.out.println("Enter the value of parameter a:");
            a = in.nextFloat();
            System.out.println("Enter the value of parameter b:");
            b = in.nextFloat();
            gp1.Activate(a, b);
            break;
          }
          case '1': { // Start
            System.out.println("Operation: Start()");
            gp1.Start();
            break;
          }
          case '2': { // PayCredit
            System.out.println("Operation: PayCredit()");
            gp1.PayCredit();
            break;
          }
          case '3': { // Reject
            System.out.println("Operation: Reject()");
            gp1.Reject();
            break;
          }
          case '4': { // PayDebit
            System.out.println("Operation: PayDebit(string p");
            System.out.println("Enter the value of parameter p:");
            s = in.nextLine();
            gp1.PayDebit(s);
            break;
          }
          case '5': { // Pin
            System.out.println("Operation: Pin(string x)");
            System.out.println("Enter the value of parameter x:");
            s = in.nextLine();
            gp1.Pin(s);
            break;
          }
          case '6': { // Cancel
            System.out.println("Operation: Cancel()");
            gp1.Cancel();
            break;
          }
          case '7': { // Approved
            System.out.println("Operation: Approved()");
            gp1.Approved();
            break;
          }
          case '8': { // Diesel
            System.out.println("Operation: Diesel()");
            gp1.Diesel();
            break;
          }
          case '9': { // Regular
            System.out.println("Operation: Regular()");
            gp1.Regular();
            break;
          }
          case 'a': { // StartPump
            System.out.println("Operation: StartPump()");
            gp1.StartPump();
            break;
          }
          case 'b': { // PumpGallon
            System.out.println("Operation: PumpGallon()");
            gp1.PumpGallon();
            break;
          }
          case 'c': { // StopPump
            System.out.println("Operation: StopPump()");
            gp1.StopPump();
            break;
          }
          case 'd': { // FullTank
            System.out.println("Operation: FullTank()");
            gp1.FullTank();
            break;
          }
          case 'q': {
            break;
          }
        }
      }
    } else if (ch == '2'){
      float a, b, c;
      int cash;
      GasPump2 gp2 = new GasPump2();
      System.out.println("\t\t\t\t\tGasPump-2");
      System.out.println("\t\tMENU of Operations");
      System.out.println("\t\t0. Activate(float, float, float)");
      System.out.println("\t\t1. PayCash(int)");
      System.out.println("\t\t2. PayCredit()");
      System.out.println("\t\t3. Approved()");
      System.out.println("\t\t4. Reject()");
      System.out.println("\t\t5. Cancel()");
      System.out.println("\t\t6. Premium()");
      System.out.println("\t\t7. Regular()");
      System.out.println("\t\t8. Super()");
      System.out.println("\t\t9. StartPump()");
      System.out.println("\t\ta. PumpLiter()");
      System.out.println("\t\tb. Stop()");
      System.out.println("\t\tc. Receipt()");
      System.out.println("\t\td. NoReceipt()");
      System.out.println("\t\tq. Quit the program");
      System.out.println("\t\tPlease make a note of these operations");
      System.out.println("\t\tGasPump-2 Execution");

      while(ch != 'q') {
        System.out.println(" Select Operation");
        System.out.println("0-Activate,1-PayCash,2-PayCredit,3-Approved,4-Reject,5-Cancel,6-Premium,");
        System.out.println("7-Regular,8-Super,9-StartPump,a-PumpLiter,b-Stop,c-Receipt,d-NoReceipt,q-quit");
        ch = in.next().charAt(0);
        switch (ch) {
          case '0': { // Activate
            System.out.println("Operation: Activate(float a, float b, float c)");
            System.out.println("Enter the value of parameter a:");
            a = in.nextFloat();
            System.out.println("Enter the value of parameter b:");
            b = in.nextFloat();
            System.out.println("Enter the value of parameter c:");
            c = in.nextFloat();
            gp2.Activate(a, b, c);
            break;
          }
          case '1': { // PayCash
            System.out.println("Operation: PayCash(int c)");
            System.out.println("Enter value of parameter c:");
            cash = in.nextInt();
            gp2.PayCash(cash);
            break;
          }
          case '2': { // PayCredit
            System.out.println("Operation: PayCredit()");
            gp2.PayCredit();
            break;
          }
          case '3': { // Approved
            System.out.println("Operation: Approved()");
            gp2.Approved();
            break;
          }
          case '4': { // Reject
            System.out.println("Operation: Reject()");
            gp2.Reject();
            break;
          }
          case '5': { // Cancel
            System.out.println("Operation: Cancel()");
            gp2.Cancel();
            break;
          }
          case '6': { // Premium
            System.out.println("Operation: Premium()");
            gp2.Premium();
            break;
          }
          case '7': { // Regular
            System.out.println("Operation: Regular()");
            gp2.Regular();
            break;
          }
          case '8': { // Super
            System.out.println("Operation: Super()");
            gp2.Super();
            break;
          }
          case '9': { // StartPump
            System.out.println("Operation: StartPump()");
            gp2.StartPump();
            break;
          }
          case 'a': { // PumpLiter
            System.out.println("Operation: PumpLiter()");
            gp2.PumpLiter();
            break;
          }
          case 'b': { // Stop
            System.out.println("Operation: Stop()");
            gp2.Stop();
            break;
          }
          case 'c': { // Receipt
            System.out.println("Operation: Receipt()");
            gp2.Receipt();
            break;
          }
          case 'd': { // NoReceipt
            System.out.println("Operation: NoReceipt()");
            gp2.NoReceipt();
            break;
          }
          case 'q': {
            break;
          }
        }
      }
    } else {
      System.out.println("Please enter 1 or 2.");
      in.nextLine();
    }
  }
}
