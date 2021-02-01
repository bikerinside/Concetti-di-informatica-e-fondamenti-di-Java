/**
Un registratore di cassa somma gli articoli vebduti
*/
public class CashRegister
{
  /**
    Costruisce un registratore di cassa senza soldi nel cassetto
  */
  public CashRegister()
  {

    purchase = 0;

    payment = 0;

  }

  /**
  Registra la vendita di un articolo
  @param amount il prezzo dell'articolo
  */
  public void recordPurchase(double amount)
  {

    double newTotal = purchase + amount;

    purchase = newTotal;

  }

  /**
  Registra la quantità di denaro ricevuta dal cliente per il pagamento.
  @param amount l'ammontare del pagamento.
  */
  public void enterPayment(double amount)
  {

    double newTotal = payment + amount;

    payment = newTotal;

  }

  /**
  Calcola il resto dovuto al cliente e azzera la macchina per la vendita successiva.
  @return il resto dovuto al cliente
  */
  public double giveChange()
  {

    double change = payment - purchase;

    purchase = 0;

    payment = 0;

    return change;

  }
  /**
  L'ammontare degli acquisti.
  */
  private double purchase;
  /**
  L'ammontare dei pagamenti.
  */
  private double payment;

}
