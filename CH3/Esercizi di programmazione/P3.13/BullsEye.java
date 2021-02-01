
/*
Disegnate un bersaglio (“bull’s eye”), vale a dire una serie di cerchi concentrici, alternando i colori bianco e nero.
11 programma deve essere costituito dalle classi Target BullsEye, BullsEyeComponent e BullsEyeViewer.
Suggerimento: Colorate un cerchio nero nella sua intera superficie, quindi sovrapponete un cerchio bianco più piccolo, e così via.
*/

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class BullsEye
{

  /**
  Costruice un cerchio al centro di un frame
  */
  public BullsEye(int x, int y)
  {

    xLeft = x;
    yTop = y;

  }

  /**
  Disegna il cerchio
  @param  g2 il contesto grafico
  */
  public void draw(Graphics2D g2)
  {

    // primo cerchio nero quello più esterno
    Ellipse2D.Double firstCircle = new Ellipse2D.Double(xLeft, yTop, 100, 100);
    // secondo cerchio bianco primo cerchio interno
    Ellipse2D.Double secondCircle = new Ellipse2D.Double(xLeft+10, yTop+10, 80, 80);
    // terzo cerchio nero, primo cerchio nero interno
    Ellipse2D.Double thirthCircle = new Ellipse2D.Double(xLeft+20, yTop+20, 60, 60);
    // quarto cerchio bianco, secondo cerchio bianco interno
    Ellipse2D.Double fourthCircle = new Ellipse2D.Double(xLeft+30, yTop+30, 40, 40);
    // centro del cerchio nero
    Ellipse2D.Double fifthCircle = new Ellipse2D.Double(xLeft+40, yTop+40,20, 20);

    g2.setColor(Color.BLACK);
    g2.fill(firstCircle);
    g2.draw(firstCircle);

    g2.setColor(Color.WHITE);
    g2.fill(secondCircle);
    g2.draw(secondCircle);

    g2.setColor(Color.BLACK);
    g2.fill(thirthCircle);
    g2.draw(thirthCircle);

    g2.setColor(Color.WHITE);
    g2.fill(fourthCircle);
    g2.draw(fourthCircle);

    g2.setColor(Color.BLACK);
    g2.fill(fifthCircle);
    g2.draw(fifthCircle);

  }

  private int xLeft;
  private int yTop;

}
