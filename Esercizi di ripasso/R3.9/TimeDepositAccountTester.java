public class TimeDepositAccountTester
{

  public static void main(String[] args)
  {

    TimeDepositAccount mioconto = new TimeDepositAccount(5000,5);

    System.out.println("Saldo iniziale = " + mioconto.getBalance());

    mioconto.monthlyInterest();

    System.out.println("Saldo dopo un mese = " + mioconto.getBalance());

    mioconto.monthlyInterest();
    mioconto.monthlyInterest();

    System.out.println("Saldo dopo tre mesi = " + mioconto.getBalance());

    mioconto.withdraw();

    System.out.println("Saldo dopo prelievo = " + mioconto.getBalance());

    System.exit(0);

  }

}
