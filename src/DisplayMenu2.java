/*
  (Strategy Pattern) (Also a product in Abstract Factory Pattern) Strategy containing the implementation for GasPump2's DisplayMenu action.
 */
public class DisplayMenu2 extends DisplayMenu {
  @Override
  public void DisplayMenu() {
    System.out.println("\t\tMENU:");
    System.out.println("\tSelect Type of Gas:");
    System.out.println();
    System.out.println("\tREGULAR");
    System.out.println("\tPREMIUM");
    System.out.println("\tSUPER");
  }
}
