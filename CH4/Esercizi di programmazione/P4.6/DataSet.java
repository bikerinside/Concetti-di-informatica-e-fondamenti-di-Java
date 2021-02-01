/*
Scrivete una classe DataSet che calcoli il valore maggiore e il valore minore
presenti in una sequenza di numeri, con i metodi:

- void addValue(int x)
- int getSum()
- double getAverage()

Tenete traccia del valore maggiore e del vbalore minore che è stato introdotto
fino al momento attuale, usando all'interno del metodo addValue i metodi Math.min e Math.max
per aggiornarli. Quali dovrebbero essere i valori iniziali per tali variabili ?
Suggerimento: Integer.MIN_VALUE, Integer.MAX_VALUE.
Scrivete un programma di collaudo DataSetTester che chiami addValue quattro volte e
visualizzi i valori previsti e i risultati ottenuti.
*/

import java.lang.Math;

public class DataSet
{

  public DataSet()
  {

    this.maxValue = Integer.MIN_VALUE;

    this.minValue = Integer.MAX_VALUE;

  }

  public void addValue(int x)
  {

    minValue = Math.min(x, this.minValue);

    maxValue = Math.max(x, this.maxValue);

  }

  public int getLargest()
  {

    return maxValue;

  }

  public int getSmallest()
  {

    return minValue;

  }

  private int minValue;

  private int maxValue;


}
