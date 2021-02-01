/*
Calcolare il resto in monete. Migliorate la classe CashRegister in modo
che possa assister un cassiere nelle operazioni di cambio.
Il registratore di casa calcola , in centesimi, il resto che deve essere
restuito al cliente.
Aggiungete alla classe CashRegister i metodi seguenti:

- int giveDollars()
- int giveQuarters()
- int giveDimes()
- int giveNickels()
- int givePennies()

Ciascuno di tali metodi calcola il numero di monente di un certo tipo che vanno
restituite al cliente e riduce il resto ancora dovuto della quantità opportuna.
Poteteipotizzare che i  metodi vengano invocati nell'rdine sopra indiciato,
come in questa classe di collaudo:

public class CashRegisterTester
{

  public static void main(String[] args)
  {

    CashRegister register = new CashRegister();

    register.recordPurchase(8.37);

    register.enterPayment(10, 0, 0, 0, 0);

    System.out.println("Dollars: " + register.giveDollars());
    System.out.println("Expected: 1");

    System.out.println("Quarters: " + register.giveQuarters());
    System.out.println("Expected: 2");

    System.out.println("Dimes: " + register.giveDimes());
    System.out.println("Expected: 1");

    System.out.println("Nickels: " + register.giveNickels());
    System.out.println("Expected: 0");

    System.out.println("Pennies: " + register.givePennies());
    System.out.println("Expected: 3");

  }


}

*/

public class CashRegister
{

  public void recordPurchase(double amount)
  {

    totalPurchase = amount;
    // convert the amount of purchase in pennies
    totalPurchase *= 100;

  }

  public void enterPayment(int dollars, int quarters, int dimes, int nickels, int pennies)
  {
    // sum all quantities of dollars and coins
    totalPayment = (dollars * DOLLAR_VALUE) + (quarters * QUARTER_VALUE) + (dimes * DIME_VALUE) + (nickels * NICKEL_VALUE) + (pennies * PENNY_VALUE);
    // calculate the amount of change
    totalPayment -= totalPurchase;

  }

  public int giveDollars()
  {

    dollarsAmount = (int) (totalPayment / DOLLAR_VALUE);

    totalPayment -= dollarsAmount * DOLLAR_VALUE;

    return dollarsAmount;

  }

  public int giveQuarters()
  {

    quartersAmount = (int) (totalPayment / QUARTER_VALUE);

    totalPayment -= quartersAmount * QUARTER_VALUE;

    return quartersAmount;


  }

  public int giveDimes()
  {

    dimesAmount = (int) (totalPayment / DIME_VALUE);

    totalPayment -= dimesAmount * DIME_VALUE;

    return dimesAmount;

  }

  public int giveNickels()
  {

    nickelsAmount = (int) (totalPayment / NICKEL_VALUE);

    totalPayment -= nickelsAmount * NICKEL_VALUE;

    return nickelsAmount;

  }

  public int givePennies()
  {

    penniesAmount = (int) (totalPayment / PENNY_VALUE);

    totalPayment -= penniesAmount * PENNY_VALUE;

    return penniesAmount;

  }

  public final static double DOLLAR_VALUE  = 100;
  public final static double QUARTER_VALUE = 25;
  public final static double DIME_VALUE    = 10;
  public final static double NICKEL_VALUE  = 5;
  public final static double PENNY_VALUE   = 1;

  private int dollarsAmount;

  private int quartersAmount;

  private int dimesAmount;

  private int nickelsAmount;

  private int penniesAmount;

  private double totalPurchase;

  private double totalPayment;

}
