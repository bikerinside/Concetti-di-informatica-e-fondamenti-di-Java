/* disegna l'automobile */

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
  Una forma di automobile che può essere posizionata ovunque sullo schermo.
*/

public class Car
{

  /**
  Costruisce un'automobile con l'angolo in alto a sinistra rassegnato
  @param x la coordinata x dell'angolo in alto a sinistra
  @param y la coordinata y dell'angolo in alto a destra
  */
  public Car(int x, int y, Color colore)
  {

    xLeft = x;
    yTop = y;
    bodyColor = colore;

  }

  /**
  Disegna l'automobile
  @param  g2 il contesto grafico
  */
  public void draw(Graphics2D g2)
  {

    Rectangle body = new Rectangle(xLeft, yTop + 10, 60, 10);

    Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + 10, yTop + 20, 10, 10);

    Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft + 40, yTop + 20, 10, 10);

    // la base del parabrezza
    Point2D.Double r1 = new Point2D.Double(xLeft + 10, yTop + 10);
    // l'inizio del tettuccio
    Point2D.Double r2 = new Point2D.Double(xLeft + 20, yTop);
    // la fine del tettuccio
    Point2D.Double r3 = new Point2D.Double(xLeft + 40, yTop);
    // la base del lunotto posteriore
    Point2D.Double r4 = new Point2D.Double(xLeft + 50, yTop + 10);

    Line2D.Double frontWindshield = new Line2D.Double(r1, r2);

    Line2D.Double roofTop = new Line2D.Double(r2, r3);

    Line2D.Double rearWindshield = new Line2D.Double(r3, r4);

    g2.setColor(bodyColor);

    g2.fill(body);

    g2.draw(body);
    g2.draw(frontTire);
    g2.draw(rearTire);
    g2.draw(frontWindshield);
    g2.draw(roofTop);
    g2.draw(rearWindshield);

  }

  private int xLeft;
  private int yTop;
  private Color bodyColor;

}
