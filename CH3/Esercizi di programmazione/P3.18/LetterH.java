import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class LetterH
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

    Line2D.Double leftLine = new Line2D.Double(10, 10, 10, 50);

    Line2D.Double leftUpperLine = new Line2D.Double(10, 10, 30, 10);

    Line2D.Double leftDownLine = new Line2D.Double(10, 50, 30, 50);

    Line2D.Double leftDownInnerLine = new Line2D.Double(30, 50, 30, 35);

    Line2D.Double leftUpInnerLine = new Line2D.Double(30, 10, 30, 25);

    Line2D.Double centerUpLine = new Line2D.Double(30, 25, 40, 25);

    Line2D.Double centerDownLine = new Line2D.Double(30, 35, 40, 35);

    Line2D.Double rightUpInnerLine = new Line2D.Double(40, 25, 40, 10);

    Line2D.Double rightDownInnerLine = new Line2D.Double(40, 35, 40, 50);

    Line2D.Double rightUpperLine = new Line2D.Double(40, 10, 60, 10);

    Line2D.Double rightDownLine = new Line2D.Double(40, 50, 60, 50);

    Line2D.Double rightLine = new Line2D.Double(60, 10, 60, 50);

    g2.draw(leftLine);

    g2.draw(leftUpperLine);

    g2.draw(leftDownLine);

    g2.draw(leftDownInnerLine);

    g2.draw(leftUpInnerLine);

    g2.draw(centerUpLine);

    g2.draw(centerDownLine);

    g2.draw(rightUpInnerLine);

    g2.draw(rightDownInnerLine);

    g2.draw(rightUpperLine);

    g2.draw(rightDownLine);

    g2.draw(rightLine);

  }

  private int x;
  private int y;
  private double width;
  private double height;

}
