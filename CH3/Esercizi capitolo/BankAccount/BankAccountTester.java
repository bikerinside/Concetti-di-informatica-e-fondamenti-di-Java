/*
Classe di collaudo per la classe BankAccount.
*/

public class BankAccountTester
{

  /**
  Collauda i metodi utilizzati dalla classe BankAccount.
  @param args non utilizzato
  */
  public static void main(String[] args)
  {

    BankAccount harrysChecking = new BankAccount();

    harrysChecking.deposit(2000);

    harrysChecking.withdraw(500);

    System.out.println(harrysChecking.getBalance());

    System.out.println("Expected: 1500");

    System.exit(0);

  }

}
