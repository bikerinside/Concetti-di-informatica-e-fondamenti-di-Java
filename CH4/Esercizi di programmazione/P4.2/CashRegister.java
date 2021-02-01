/*
Migliorate la classe CashRegister in modo che tenga traccia del numero complessivo
di articoli che compongono un acquisto.
Contate tutti gli articoli acquistati e fornite un metodo

int getItemCount()
*/

import java.lang.Math;

public class CashRegister
{

  public int getItemCount()
  {

    return items;

  }

  public float giveChange()
  {

    float total = dollars * DOLLAR + quarters * QUARTER + dimes * DIME + nickels * NICKEL + pennies * PENNY;

    total -= purchase;

    items = 0;

    return Math.round(total * 100.0f) / 100.0f;

  }

  public void recordPurchase(float purchaseAmount)
  {

    purchase += purchaseAmount;

    items++;

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

  public void enterPennies(int penniesAmount)
  {

    pennies = penniesAmount;

  }

  public final static float PENNY = 0.01F;
  public final static float NICKEL = 0.05F;
  public final static float DIME = 0.10F;
  public final static float QUARTER = 0.25F;
  public final static float DOLLAR = 1.00F;

  private int dollars;
  private int quarters;
  private int dimes;
  private int nickels;
  private int pennies;

  private float purchase;
  private int items;

}
