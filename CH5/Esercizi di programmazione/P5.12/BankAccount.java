/*

Esercizio P5.12 Migliorate la classe BamkAccount del Capitolo 3,
in modo da rifiutare:
1. Importi negativi nei metodi deposit e withdraw.
2. Prelievi che portino ad un saldo negativo.

*/

/**
Un conto bancario ha un saldo che può essere modificato
da depositi e prelievi
*/
public class BankAccount
{
  // costruttori
  /**
  costruisce un conto bancario con saldo uguale a zero
  */
  public BankAccount()
  {

    balance = 0;

  }
  /**
  Costruisce un conto bancario con un saldo assegnato
  @param initialBalance il saldo iniziale
  */
  public BankAccount(double initialBalance)
  {

    balance = initialBalance;

  }

  // Metodi
  /**
  Deposita denaro sul conto bancario
  @param amount l'importo da versare
  */
  public void deposit(double amount)
  {

    if(amount > 0 )
    {

      double newBalance = balance + amount;

      balance = newBalance;

    }

    else
      System.out.println("Can't deposit negative amount!");

  }
  /**
  Preleva denaro dal conto bancario
  @param amount l'importo da prelevare
  */
  public void withdraw(double amount)
  {

    if ((balance - amount) >= 0 )
    {

      double newBalance = balance - amount;

      balance = newBalance;

    }

    else
      System.out.println("Not enough avaibility!");

  }

  /**
  Ispeziona il saldo attuale del conto corrente.
  @return il saldo attuale
  */
  public double getBalance()
  {

    return balance;

  }

  public void addInterest(double rate)
  {

    balance = balance + ((balance * rate) / 100);

  }

  /**
   saldo del conto
  */
  private double balance;

}
