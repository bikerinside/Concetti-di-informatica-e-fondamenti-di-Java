import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class LetterE
{

  /*public LetterH(int x, int y, double width, double height)
  {

    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;

  }*/

  public void draw(Graphics2D g2)
  {

    Line2D.Double leftLine = new Line2D.Double(70, 10, 70, 50);

    Line2D.Double upperLine = new Line2D.Double(70, 10, 90, 10);

    Line2D.Double downLine = new Line2D.Double(70, 50, 90, 50);

    Line2D.Double rightLine1 = new Line2D.Double(90, 10, 90, 20);

    Line2D.Double centerLine1 = new Line2D.Double(90, 20, 80, 20);

    Line2D.Double centerLine2 = new Line2D.Double(80, 20, 80, 30);

    Line2D.Double centerLine3 = new Line2D.Double(80, 30, 90, 30);

    Line2D.Double centerLine4 = new Line2D.Double(90, 30, 90, 40);

    Line2D.Double centerLine5 = new Line2D.Double(90, 40, 80, 40);

    Line2D.Double centerLine6 = new Line2D.Double(80, 40, 80, 45);

    Line2D.Double centerLine7 = new Line2D.Double(80, 45, 90, 45);

    Line2D.Double centerLine8 = new Line2D.Double(90, 45, 90, 50);




    g2.draw(leftLine);

    g2.draw(upperLine);

    g2.draw(downLine);

    g2.draw(rightLine1);

    g2.draw(centerLine1);

    g2.draw(centerLine2);

    g2.draw(centerLine3);

    g2.draw(centerLine4);

    g2.draw(centerLine5);

    g2.draw(centerLine6);

    g2.draw(centerLine7);

    g2.draw(centerLine8);

  }

  private int x;
  private int y;
  private double width;
  private double height;

}
