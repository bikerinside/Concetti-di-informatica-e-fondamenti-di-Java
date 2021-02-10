/*
Scrivete un programma che chieda all’utente di digitare il numero identificativo di un mese (1 per gennaio, 2 per febbraio, e così via),
per poi visualizzare il numero di giorni da cui è composto il mese selezionato. Nel caso di febbraio, visualizzate il messaggio “28 days”.

Enter a month(1-12):
5
31 days

Reallizzate una classe Month con un metodo int getDays().
*/

public class Month
{

  public Month(int month)
  {

      this.month = month;

  }

  public int getDays()
  {

    switch(month)
    {

      case 1: return 31;
      case 2: return 28;
      case 3: return 31;
      case 4: return 30;
      case 5: return 31;
      case 6: return 30;
      case 7: return 31;
      case 8: return 31;
      case 9: return 30;
      case 10: return 31;
      case 11: return 30;
      case 12: return 31;

      default: return -1;

    }

  }

  private int month;

}
