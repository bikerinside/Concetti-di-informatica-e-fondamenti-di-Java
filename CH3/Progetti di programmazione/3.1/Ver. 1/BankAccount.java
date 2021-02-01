/**
Un conto bancario ha un saldo che può essere modificato
da depositi e prelievi
*/
public class BankAccount
{
  // costruttori
  /**
  Costruisce un conto bancario con un saldo assegnato e una commissione su ogni operazione
  @param initialBalance il saldo iniziale
  @param feeAmount l'ammontare della commissione su ogni operazione
  */
  public BankAccount(double initialBalance, double feeAmount)
  {

    balance = initialBalance;

    fee = feeAmount;

  }

  // Metodi
  /**
  Deposita denaro sul conto bancario
  @param amount l'importo da versare
  */
  public void deposit(double amount)
  {

    double newBalance = balance + amount;

    balance = newBalance - fee;

  }
  /**
  Preleva denaro dal conto bancario
  @param amount l'importo da prelevare
  */
  public void withdraw(double amount)
  {

    double newBalance = balance - amount;

    balance = newBalance - fee;

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

  private double fee;

}
