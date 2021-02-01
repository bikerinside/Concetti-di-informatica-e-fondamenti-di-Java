public class BankAccountTester
{

  /**
  Collauda i metodi utilizzati dalla classe BankAccount.
  @param args non utilizzato
  */
  public static void main(String[] args)
  {

    BankAccount harrysChecking = new BankAccount(500, 1);

    harrysChecking.deposit(1000);

    System.out.println(harrysChecking.getBalance());
    harrysChecking.withdraw(500);

    System.out.println(harrysChecking.getBalance());

    harrysChecking.withdraw(400);
    System.out.println(harrysChecking.getBalance());

    System.out.println(harrysChecking.getBalance());

    System.exit(0);

  }

}
