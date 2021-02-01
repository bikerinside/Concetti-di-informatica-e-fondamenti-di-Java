public class CashRegisterTester
{

  public static void main(String[] args)
  {

    CashRegister register = new CashRegister();
    register.recordPurchase(20.37f);
    register.recordPurchase(20.37f);
    register.recordPurchase(20.37f);
    register.enterDollars(61);
    register.enterQuarters(2);
    System.out.println("Total amount items = " + register.getItemCount());
    System.out.println("Change: " + register.giveChange());
    System.out.println("Expected: 0.39");

    System.exit(0);

  }

}
