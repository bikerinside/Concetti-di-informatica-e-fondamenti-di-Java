/**
Un conto corrente deposito dove vengono accreditati interessi a cadenza mensile
*/
public class TimeDepositAccount
{
  /**
  costruisce un conto bancario e il suo tasso d'interesse
  @param initialBalance il saldo inziaale del conto
  @param initialInterest il tasso d'interesse iniziale
  */
  public TimeDepositAccount(double initialBalance, double initialInterest)
  {

    balance = initialBalance;

    interestRate = initialInterest;

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
  interessi che vengono depositati sul conto mensilmente
  */
  public void monthlyInterest()
  {

    double interest = (balance * interestRate) / 100;

    balance = balance + interest;

  }
  /**
  preleva tutti i soldi disponibili dal conto bancario
  */
  public void withdraw()
  {

    double amount = this.getBalance();

    balance = balance - amount;

  }
  /**
   saldo del conto bancario
  */
  private double balance;
  /**
  tasso di interesse del conto bancario
  */
  private double interestRate;

}
