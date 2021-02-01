/*
Esercizio P4.14. Scrivete un programma che legge due indicazioni orarie in formato militare (0900, 1730)
e stampa il numero di ore e di minuti che separano i due orari.
Ecco un esemio di esecuzione (i dati inseriti dall'utente sono in grassetto)

Please enter the first time: 0900
Please enter the second time: 1730
8 hours 30 minutes

Otterrete una valutazione maggiore  se riuscite a gestire il caso in cui il primo
orario è successivo al secondo orario

Please enter the first time: 1730
Please enter the second time: 0900
15 hours 30 minutes

Realizzate una classe TimeInterval il cui costruttore riceve due orari in formato
militare. La classe dovrebbe avere due metodi, getHours e getMinutes.

*/

public class TimeInterval
{

  public TimeInterval(int firstTime, int secondTime)
  {

    this.firstTime = firstTime;

    this.secondTime = secondTime;

  }

  public int getHours()
  {

    if((firstTime / HOURS_MINUTE_SEPARATOR) < (secondTime / HOURS_MINUTE_SEPARATOR))
    {

      return (secondTime / HOURS_MINUTE_SEPARATOR) - (firstTime / HOURS_MINUTE_SEPARATOR);

    }

    else
    {

      return (24 - (firstTime / HOURS_MINUTE_SEPARATOR)) + (secondTime / HOURS_MINUTE_SEPARATOR);

    }

  }

  public int getMinutes()
  {

    return (firstTime % HOURS_MINUTE_SEPARATOR) + (secondTime % HOURS_MINUTE_SEPARATOR);

  }

  private final static int HOURS_MINUTE_SEPARATOR = 100;

  private int firstTime;
  private int secondTime;

}
