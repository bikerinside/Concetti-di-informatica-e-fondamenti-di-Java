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

    double newBalance = balance + amount;

    balance = newBalance;

  }
  /**
  Preleva denaro dal conto bancario
  @param amount l'importo da prelevare
  */
  public void withdraw(double amount)
  {

    double newBalance = balance - amount;

    balance = newBalance;

  }

  /**
  Ispeziona il saldo attuale del conto corrente.
  @return il saldo attuale
  */
  public double getBalance()
  {

    return balance;

  }
  /**
   saldo del conto
  */
  private double balance;

}
