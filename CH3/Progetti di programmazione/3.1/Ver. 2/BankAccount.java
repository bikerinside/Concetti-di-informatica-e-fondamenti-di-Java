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
  public BankAccount(double initialBalance, int feeAmount)
  {

    balance = initialBalance;

    fee = feeAmount;

    freeOp = 4;

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

    freeOp = freeOp - 1;

  }
  /**
  Preleva denaro dal conto bancario
  @param amount l'importo da prelevare
  */
  public void withdraw(double amount)
  {

    double newBalance = balance - amount;

    balance = newBalance;

    freeOp = freeOp - 1;

  }

  /**
  Ispeziona il saldo attuale del conto corrente.
  @return il saldo attuale
  */
  public double getBalance()
  {

    return balance;

  }

  public void deductMonthlyCharge()
  {
    // se le operazioni gratuite sono
    if(freeOp < 0)
    {

      balance = balance  + (freeOp * fee);

    }

    freeOp = 4;

  }

  /**
   saldo del conto
  */
  private double balance;

  private int fee;

  private int freeOp;

}
