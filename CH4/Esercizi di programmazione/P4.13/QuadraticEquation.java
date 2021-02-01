/*
Esercizio P4.13. Realizzate una classe QuadraticEquation il cui costruttore riceve i coefficienti
a, b e c dell'equazione quadratica ax2 + bx+ c = 0. Fornite i metodi getSolutionl e getSolution2
che restituiscono le soluzioni, usando la formula quadratica.

Scrivete una classe di collaudo QuadraticEquationTester che costruisce un oggetto
di tipo QuadraticEquation e visualizza le due soluzioni.
*/

public class QuadraticEquation
{

  public QuadraticEquation(double a, double b, double c)
  {

    this.a = a;
    this.b = b;
    this.c = c;

  }

  public double getSolution1()
  {

    return ((-1 * b) + Math.sqrt((b * b) - (4.0 * a * c))) / (2.0 * a);

  }

  public double getSolution2()
  {

    return ((-1 * b) - Math.sqrt((b * b) - (4.0 * a * c))) / (2.0 * a);

  }

  private double a;
  private double b;
  private double c;

}
