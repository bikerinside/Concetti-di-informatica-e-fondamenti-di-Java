/*

La classe CashRegister ha una sfortunata limitazione: è strettamente connessa al sistema
monetario degli Stati Uniti e del Canada. Il vostro obiettivo è quello di progettare un registratore di
cassa che sia in grado di funzionare, invece, con euro e centesimi di euro. Però, invece di realizzare
per il mercato europeo un’altra versione di CashRegister, altrettanto limitata, dovete progettare
una classe separata, Coin, che rappresenti un valore monetario, e un registratore di cassa che possa
funzionare con monete di ogni tipo.

*/

/**
Un registratore di cassa configurabile, in base alla valuta desiderata
mediante l'utilizzo della classe Coin.
*/
public class CashRegister
{

  public void recordPurchase(double amount)
  {

    purchase = amount;

  }

  public void enterPayment(int coinCount, Coin coinType)
  {

    payment += coinCount * coinType.getValue();

  }

  public double giveChange()
  {

    double change = payment - purchase;

    payment = 0;

    purchase = 0;

    return Math.round(change * 100.00) / 100.00;

  }

  private double purchase;

  private double payment;

}
