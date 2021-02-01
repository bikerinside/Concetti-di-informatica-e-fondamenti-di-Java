/*
Classe di collaudo per la classe BankAccount.
Esercizio P3.3. Scrivete una classe SavingsAccount (conto di risparmio),
 simile alla classe BankAccount, tranne per la presenza di un ulteriore campo di esemplare, interest.
 Fornite un costruttore che assegni un valore sia al saldo iniziale sia al tasso di interesse.
 Fornite anche un metodo addlnterest (privo di parametri espliciti) che aggiunga gli interessi al conto.
 Scrivete poi una classe SavingsAccountTester che costruisca uno di tali "conti di risparmio"
 con un saldo iniziale di $ 1000 e un tasso di interesse del 10%. Applicate, infine, per cinque volte il metodo addlnterest,
 visualizzando il saldo finale e il suo valore previsto, dopo averlo calcolato manualmente.
*/

public class SavingsAccountTester
{
  /**
  Collauda i metodi utilizzati dalla classe BankAccount.
  @param args non utilizzato
  */
  public static void main(String[] args)
  {

    SavingsAccount momSavings = new SavingsAccount(1000,10);

    momSavings.addInterest();
    momSavings.addInterest();
    momSavings.addInterest();
    momSavings.addInterest();
    momSavings.addInterest();

    System.out.println(momSavings.getBalance());

    System.out.println("Expected: 1610.51");

    System.exit(0);

  }

}
