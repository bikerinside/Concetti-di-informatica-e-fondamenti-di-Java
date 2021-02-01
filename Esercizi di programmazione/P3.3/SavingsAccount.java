

public class SavingsAccount
{

  /**
  Costruisce un conto bancario con un saldo e tasso interesse assegnato
  @param initialBalance il saldo iniziale
  @param initialRate    il tasso d'interesse
  */
  public SavingsAccount(double initialBalance, double initialRate)
  {

    balance = initialBalance;

    interestRate = initialRate;

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
  Tasso d'interesse applicato al conto corrente.
  */
  public void addInterest()
  {

    balance = balance + ((balance * interestRate) / 100);

  }

  /**
   saldo del conto
  */
  private double balance;
  /**
  tasso d'interesse del conto bancario
  */
  private double interestRate;

}
