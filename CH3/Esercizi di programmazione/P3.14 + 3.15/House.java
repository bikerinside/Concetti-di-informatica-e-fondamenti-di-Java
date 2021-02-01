/*
Scrivete un programma che tracci lo schizzo di una casa,
semplice come la figura qui riportata oppure più elaborata,
se preferite (potete utilizzare una vista prospettica,
disegnare un grattacielo, colonne di marmo nell’ingresso o qualsiasi cosa).
Progettare la classe House e dotatela del metodo draw(Graphics2D g2) che disegni la casa.
+
Migliorate l’esercizio precedente dotando la classe House
di un costruttore che consenta di specificare posizione e dimensione della casa da visualizzare,
quindi popolate lo schermo con un po’di case di varie dimensioni.
*/

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


public class House
{

  /**
  Costruice una casa nella posizione (x,y)
  e con dimensione Width x Height
  */
  public House(int x, int y, int width, int height)
  {

    xLeft = x;
    yTop = y;
		this.width = width;
		this.height = height;

  }

  /**
  Disegna una casa
  @param  g2 il contesto grafico
  */
  public void draw(Graphics2D g2)
  {

		Rectangle frontHouse = new Rectangle(xLeft, yTop, width, height);

		Rectangle doorHouse = new Rectangle(xLeft + (width / 8), yTop + (height / 2), width / 3, height / 2);

		Rectangle windowHouse = new Rectangle(xLeft + (width/ 2), yTop + (height / 2), width / 4, height / 4);

		Line2D.Double leftRoof = new Line2D.Double(xLeft, yTop, xLeft + (width / 2), yTop - (height / 2));

		Line2D.Double rightRoof = new Line2D.Double(xLeft + width, yTop, xLeft + (width / 2), yTop - (height / 2));

    g2.draw(frontHouse);
    g2.draw(doorHouse);
    g2.draw(windowHouse);
    g2.draw(leftRoof);
    g2.draw(rightRoof);

  }

  private int xLeft;
  private int yTop;

  private int width;
  private int height;

}
