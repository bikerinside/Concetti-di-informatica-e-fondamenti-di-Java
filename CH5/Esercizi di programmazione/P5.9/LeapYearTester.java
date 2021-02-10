/*
Esercizio P5.9. Un anno con 366 giorni è detto anno bisestile ("leap year").
Un anno è bisestile se è divisibile per quattro (per esempio, il 1980), ma,
dopo l'adozione del calendario gregoriano avvenuta il 15 ottobre 1582, 
un anno non è bisestile se e divisibile per 100 (per esempio, il 1900),
mentre è bisestile se è divisibile per 400 (per esempio, il 2000).
Scriveteun programma che chieda all'utente di inserire un anno e che calcoli se l'anno è bisestile.
Scrivere una classe Year con un metodo predicativo boolean isLeapYear().
*/

import java.util.Scanner;

public class LeapYearTester
{

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter year: ");

    int year = input.nextInt();

    LeapYear test = new LeapYear(year);

    if(test.isLeapYear())
      System.out.println(year + " leap year");

    else
      System.out.println(year + " not leap year");

    System.exit(0);

  }

}
