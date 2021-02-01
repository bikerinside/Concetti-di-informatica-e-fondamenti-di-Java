public class BankAccountTester
{

  /**
  Collauda i metodi utilizzati dalla classe BankAccount.
  @param args non utilizzato
  */
  public static void main(String[] args)
  {

    BankAccount harrysChecking = new BankAccount(500, 1);
    // Primo mese
    harrysChecking.deposit(1000);
    harrysChecking.withdraw(500);

    harrysChecking.deposit(1000);
    harrysChecking.deposit(1000);

    harrysChecking.deposit(1000);
    harrysChecking.withdraw(500);

    harrysChecking.deductMonthlyCharge();
    System.out.println(harrysChecking.getBalance());
    // secondo mese
    harrysChecking.deposit(1000);
    harrysChecking.withdraw(500);

    harrysChecking.deposit(1000);
    harrysChecking.withdraw(500);

    harrysChecking.deductMonthlyCharge();
    System.out.println(harrysChecking.getBalance());

    // terzo mese
    harrysChecking.deposit(1000);
    harrysChecking.deposit(1000);

    harrysChecking.deposit(1000);
    harrysChecking.withdraw(500);

    harrysChecking.deposit(1000);
    harrysChecking.withdraw(500);


    harrysChecking.deposit(1000);
    harrysChecking.withdraw(500);

    harrysChecking.deductMonthlyCharge();
    System.out.println(harrysChecking.getBalance());

    System.exit(0);

  }

}
