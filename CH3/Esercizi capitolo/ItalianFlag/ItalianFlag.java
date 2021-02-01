import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class ItalianFlag
{

  public ItalianFlag(int x, int y, double aWidth)
  {

    xLeft = x;
    yTop = y;
    width = aWidth;

  }

  public void draw(Graphics2D g2)
  {

    Rectangle leftRectangle = new Rectangle(100, 100, 30, 60);

    Rectangle centerRectangle = new Rectangle(130, 100, 30, 60);

    Rectangle rightRectangle = new Rectangle(160, 100, 30, 60);

    Line2D.Double topLine = new Line2D.Double(130, 100, 160, 100);

    Line2D.Double bottomLine = new Line2D.Double(130, 160, 160, 160);
    /*
    Rectangle leftRectangle = new Rectangle(xLeft, yTop, width / 3, width * 2 / 3);

    Rectangle rightRectangle = new Rectangle(xLeft + width * 2 / 3, yTop, width / 3, width * 2 / 3);

    Rectangle topLine = new Rectangle(xLeft + width / 3, yTop, xLeft + width * 2 / 3, yTop);

    Rectangle bottomLine = new Rectangle(xLeft + width / 3, yTop + width * 2 / 3, xLeft + width * 2 / 3, yTop + width * 2 / 3);
    */

    g2.setColor(Color.GREEN);

    g2.fill(leftRectangle);

    g2.setColor(Color.RED);

    g2.fill(rightRectangle);

    g2.setColor(Color.WHITE);

    g2.fill(centerRectangle);

    g2.draw(topLine);

    g2.draw(bottomLine);

  }

  private int xLeft;
  private int yTop;
  private double width;

}
