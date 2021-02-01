import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


public class LetterO
{

  public void draw(Graphics2D g2)
  {

    Ellipse2D.Double letter4 = new Ellipse2D.Double(160, 10, 40, 40);

    Ellipse2D.Double letter5 = new Ellipse2D.Double(165, 15, 30, 30);

    g2.draw(letter4);

    g2.draw(letter5);

  }


}
