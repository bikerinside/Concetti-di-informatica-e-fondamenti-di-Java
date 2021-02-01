/*
Scrivete una classe Square il cui  costruttore riceve la lunghezza
dei lati di un quadrato.
Progettate i metodi necessari a calcolare:
- il perimetro del quadrato
- lunghezza della diagonale(usando il teorema di Pitagora)

*/

public class Square
{

  public Square(double sideLenght)
  {

    this.sideLenght = sideLenght;

  }

  public double getPerimeter()
  {

    return sideLenght * SIDES;

  }

  public double getDiagonal()
  {

    return sideLenght * SQRT2;
  }

  public double getSide()
  {

    return this.sideLenght;

  }

  public final static int SIDES = 4;

  public final static double SQRT2 = 1.414213562373095;

  private double sideLenght;

}
