/*
/Migliorate la classe CashRegister aggiungendo i metodi enterDollars
enterQuarters, enterDimes, enterNickels e EnterPennies.
Usate questa classe di collaudo:

public class CashRegisterTester
{

  public static void main(String[] args)
  {

    CashRegister register = new CashRegister();
    register.recordPurchase(20.37f);
    register.enterDollars(20);
    register.enterQuarters(2);
    System.out.println("Change: " + register.giveChange());
    System.out.println("Expected: 0.13");

  }

}

*/

import java.lang.Math;

public class CashRegister
{

  public float giveChange()
  {

    float total = dollars * DOLLAR + quarters * QUARTER + dimes * DIME + nickels * NICKEL;

    total -= purchase;

    return Math.round(total * 100.0f) / 100.0f;

  }

  public void recordPurchase(float purchaseAmount)
  {

    purchase = purchaseAmount;

  }

  public void enterDollars(int dollarsAmount)
  {

    dollars = dollarsAmount;

  }

  public void enterQuarters(int quartersAmount)
  {

    quarters = quartersAmount;

  }

  public void enterDimes(int dimesAmount)
  {

    dimes = dimesAmount;

  }

  public void enterNickels(int nickelsAmount)
  {

    nickels = nickelsAmount;

  }

  public void enterPennies(int nickelsPennies)
  {

    pennies = penniesAmount;

  }

  public final static float PENNY = 0.1F;
  public final static float NICKEL = 0.5F;
  public final static float DIME = 0.10F;
  public final static float QUARTER = 0.25F;
  public final static float DOLLAR = 1.00F;

  private int dollars;
  private int quarters;
  private int dimes;
  private int nickels;
  private int pennies;

  private float purchase;

}
