/*
  (Strategy Pattern) (Also a product in Abstract Factory Pattern) Strategy containing the implementation for GasPump1's DisplayMenu action.
 */
public class DisplayMenu1 extends DisplayMenu {
  @Override
  public void DisplayMenu() {
    System.out.println("\t\tMENU:");
    System.out.println("\tSelect Type of Gas:");
    System.out.println("\tRegular");
    System.out.println("\tDiesel");
  }
}
