/*

In questo progetto elaborerete triangoli. Un triangolo è definito dalle coordinate x e y
dei suoi tre vertici. Il vostro compito consiste nel calcolare le seguenti proprietà di un dato
triangolo:

• le lunghezze di tutti i lati
• gli angoli in tutti i vertici
• il perimetro
• l’area

Progettate la classe Triangle con i metodi appropriati.
Realizzate, poi, un programma che chieda all’utente le coordinate dei vertici
e generi una tabella ben impaginata che contenga tutte le sopraelencate proprietà del triangolo.

*/

/**
Una classe Triangle che calola la lunghezza di tutti i lati
gli angoli in tutti i vertici, il perimetro e l'area.
Dai punti inseriti del piano cartesiano.

@author bikerinside
*/

public class Triangle
{
  /**
  costruttore che costruisce un oggetto di tipo triangle
  @param i punti del piano cartsiano che formano un triangolo
  */
  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3)
  {

    this.x1 = x1;
    this.y1 = y1;

    this.x2 = x2;
    this.y2 = y2;

    this.x3 = x3;
    this.y3 = y3;

  }
  /**
  Calcola il cateto AB
  @return la lunghezza del cateto
  */
  public double sideA()
  {

    sideAB = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    return sideAB;

  }

  /**
  Calcola il cateto BC
  @return la lunghezza del cateto
  */
  public double sideB()
  {

    sideBC = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));

    return sideBC;

  }

  /**
  Calcola il cateto CA
  @return la lunghezza del cateto
  */
  public double sideC()
  {

    sideCA = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

    return sideCA;

  }
  /**
  Calcola il perimetro del triangolo
  @return il valore del perimetro
  */
  public double getPerimeter()
  {

    perimeter = this.sideA() + this.sideB() + this.sideC();

    return perimeter;

  }

  /**
  Calcola l'area triangolo
  @return il valore dell'area
  */
  public double getArea()
  {

    double halfP = perimeter / 2.00;

    area = Math.sqrt(halfP * (halfP - sideAB) * (halfP - sideBC) * (halfP - sideCA));

    return area;

  }

  /**
  Calcola l'angolo alpha del triangolo
  @return l'angolo espresso in gradi
  */
  public double getAlpha()
  {

    alpha = Math.acos(((sideBC * sideBC) + ( sideCA * sideCA) - (sideAB * sideAB)) / (2.00 * sideBC * sideCA));

    return Math.toDegrees(alpha);

  }

  /**
  Calcola l'angolo beta del triangolo
  @return l'angolo espresso in gradi
  */
  public double getBeta()
  {

    beta = Math.acos(((sideAB * sideAB) + (sideCA * sideCA) - (sideBC * sideBC)) / (2.00 * sideAB * sideCA));

    return Math.toDegrees(beta);

  }

  /**
  Calcola l'angolo gamma del triangolo
  @return l'angolo espresso in gradi
  */
  public double getGamma()
  {

    gamma = Math.acos(((sideAB * sideAB) + (sideBC * sideBC) - (sideCA * sideCA)) / (2.00 * sideAB * sideBC));

    return Math.toDegrees(gamma);

  }

  private double x1;
  private double y1;

  private double x2;
  private double y2;

  private double x3;
  private double y3;

  private double sideAB;
  private double sideBC;
  private double sideCA;

  private double perimeter;
  private double area;

  private double alpha;
  private double beta;
  private double gamma;

}
