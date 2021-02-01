/*
La classe GregorianCalendar descrive un instante nel tempo, misurato tramite il calendario gregoriano, che è il calendario
adottato oggi come standard in tutto il mondo. Si costruisce un oggetto di tipo GregorianCalendar usando come parametri un anno,
un mese e un giorno del mese, in questo modo:

GregorianCalendar cal = new GregorianCalendar(); // la data di oggi
GregorianCalendar eckertsBirthday = new GregorianCalendar(1919, Calendar.APRIL, 9);
Per specificare il mese usate le costanti Calendar.JANUARY...Calendar.DICEMBER .

Per aggiungere un certo numero di giorni ad una data rappresentata da un oggetto di tipo GregorianCalendar si può
usare il metodo add:

cal.add(Calendar.DAY_OF_MONTH, 10);
// ora cal rappresentata il decimo giorno nel futuro a partire da oggi

Si tratta di un metodo modificatore: modifica l'oggetto cal.
Per ottenere informazioni da un oggetto di tipo GregorianCalendar si può usare il metodo get:

int dayofMonth = cal.get(Calendar.DAY_OF_MONTH);
int month = cal.get(Calendar.MONTH);
int year = cal.get(Calendar.YEAR);
int weekday = cal.get(Calendar.DAY_OF_WEEK);
// 1 rappresenta domenica, 2 lunedì, ..., 7 sabato

Il vostro compito consiste nella realizzazione di un programma che visualizzi le seguenti informazioni:

- La data e il giorno della settimana che dista 100 giorni da oggi nel futuro.
- Il giorno della settima della vostra data di nascita.
- La data che dista 10.000 giorni nel futuro dalla vostra data di nascita.

Se non volete rendere nota la vostra data di nascita, usate quella di uno scienziato informatico.
FORMATO DATA DD/MM/YYYY
*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar
{

  public static void main(String[] args)
  {
    // data di oggi
    GregorianCalendar oggi = new GregorianCalendar();
    // data di nascita di James Gosling padre del linguaggio Java
    GregorianCalendar goslingBirtday = new GregorianCalendar(1955, (Calendar.MAY), 19);
    // somma alla data corrente 100 giorni
    oggi.add(Calendar.DAY_OF_MONTH, 100);
    // Visualizza a video la data di oggi + 100 giorni, è necessario aggiungere +1 al mese per ottenere il risultato corretto
    System.out.print("Today + 100 = " + oggi.get(Calendar.DATE) + "/");

    System.out.println((oggi.get(Calendar.MONTH)+1) + "/" + oggi.get(Calendar.YEAR));
    // visualizza il giorno della settimana della data di nascita di James Gosling
    System.out.println("Birthday of James Gosling = " + goslingBirtday.get(Calendar.DAY_OF_WEEK));
    // somma 10.000 giorni alla data di nascita di James Gosling
    goslingBirtday.add(Calendar.DAY_OF_MONTH, 10000);
    // visulizza la data di nascita di James Gosling + 10.0000
    System.out.print("Birthday of James Gosling + 10.000 = " + goslingBirtday.get(Calendar.DATE));
    System.out.println("/" + (goslingBirtday.get(Calendar.MONTH)+1) + "/" + goslingBirtday.get(Calendar.YEAR));

    System.exit(0);

  }

}
