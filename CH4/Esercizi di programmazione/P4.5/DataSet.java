/*
Definite una classe DataSet che calcoli la somma e la media di una sequenza di numeri interi,
con i metodi:
- void addValue(int x)
- int getSum()
- double getAverage()

Suggerimento: memorizzate la somma e il conteggio dei valori.
Scrivete poi un programma di collaudo DataTester che chiami addValue quattro volte
e visulizzi i valori previsti e i risultati ottenuti.

*/

public class DataSet
{

  public void addValue(int x)
  {

    total += x;

    count++;

  }

  public int getSum()
  {

    return total;

  }

  public double getAverage()
  {

    average = (double) total / count;

    return average;

  }

  private int total;

  private int count;

  private double average;

}
