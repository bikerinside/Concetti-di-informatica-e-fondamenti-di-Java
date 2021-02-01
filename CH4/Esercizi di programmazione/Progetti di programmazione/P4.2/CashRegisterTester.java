public class CashRegisterTester
{

  public static void main(String[] args)
  {

    CashRegister register = new CashRegister();

    Coin euroCent  = new Coin(0.01, "euroCent");
    Coin euro2Cent = new Coin(0.02, "euro2Cent");
    Coin euro5Cent = new Coin(0.05, "euro5Cent");
    Coin euro10Cent = new Coin(0.10, "euro10Cent");
    Coin euro20Cent = new Coin(0.20, "euro20Cent");
    Coin euro50Cent = new Coin(0.50, "euro50Cent");
    Coin euro1  = new Coin(1.00, "euro1");
    Coin euro2 = new Coin(2.00, "euro2");

    register.recordPurchase(8.50);

    register.enterPayment(10, euro1);
    register.enterPayment(1, euro2Cent);
    register.enterPayment(1, euroCent);

    System.out.println("Change = " + register.giveChange());

  }


}
