/*
Scrivete un programma che chieda all’utente di fornire due numeri interi e che poi ne stampi:

La somma
La differenza
Il prodotto
Il valore medio
La distanza (cioè il valore assoluto della differenza)
Il valore massimo (cioè il valore più grande dei due)
Il valore minimo (cioè il valore più piccolo dei due)
*/

import java.lang.Math;
import javax.swing.JOptionPane;

public class Pair
{

  public Pair(double aFirst, double aSecond)
  {

    first = aFirst;
    second = aSecond;

  }

  public double getSum()
  {

    return Math.round((first + second) * 100.00) / 100.00;

  }

  public double getSubtraction()
  {

    return Math.round((first - second) * 100.00) / 100.00;

  }

  public double getMultiplication()
  {

    return Math.round((first * second) * 100.00) / 100.00;

  }

  public double getAverage()
  {

    return Math.round(((first + second) / 2) * 100.00) / 100.00;

  }

  public double getAbs()
  {

    return Math.round(Math.abs(first - second) * 100.00) / 100.00 ;

  }

  public double getMax()
  {

    return Math.max(first, second);

  }

  public double getMin()
  {

    return Math.min(first, second);

  }

  private double first;
  private double second;

}
