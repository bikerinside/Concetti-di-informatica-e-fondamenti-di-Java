/*
Classe di collaudo per la classe BankAccount.
Scrivete una classe BankAccountTester il cui metodo main costruisca
un conto bancario, versi in esso $ 1000, prelevi da esso $ 500,
prelevi altri $ 400 e infine visualizzi il saldo rimanente,
seguito dal suo valore previsto.
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

    harrysChecking.deposit(1000);

    harrysChecking.withdraw(500);

    harrysChecking.withdraw(400);

    System.out.println(harrysChecking.getBalance());

    System.out.println("Expected: 100");

    System.exit(0);

  }

}
