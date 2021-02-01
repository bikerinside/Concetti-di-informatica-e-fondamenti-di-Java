import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class LetterL
{


  public void draw(Graphics2D g2)
  {

    Line2D.Double line1 = new Line2D.Double(110, 10, 110, 50);

    Line2D.Double line2 = new Line2D.Double(110, 10, 120, 10);

    Line2D.Double line3 = new Line2D.Double(120, 10, 120, 40);

    Line2D.Double line4 = new Line2D.Double(120, 40, 130, 40);

    Line2D.Double line5 = new Line2D.Double(130, 40, 130, 50);

    Line2D.Double line6 = new Line2D.Double(130, 50, 110, 50);

    g2.draw(line1);

    g2.draw(line2);

    g2.draw(line3);

    g2.draw(line4);

    g2.draw(line5);

    g2.draw(line6);

    Line2D.Double line7 = new Line2D.Double(140, 10, 140, 50);

    Line2D.Double line8 = new Line2D.Double(140, 50, 160, 50);

    Line2D.Double line9 = new Line2D.Double(160, 50, 160, 40);

    Line2D.Double line10 = new Line2D.Double(160, 40, 150, 40);

    Line2D.Double line11 = new Line2D.Double(150, 40, 150, 10);

    Line2D.Double line12 = new Line2D.Double(150, 10, 140, 10);

    g2.draw(line7);

    g2.draw(line8);

    g2.draw(line9);

    g2.draw(line10);

    g2.draw(line11);

    g2.draw(line12);

  }

  private int x;
  private int y;
  private double width;
  private double height;

}
