import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class LetterComponent extends JComponent
{

  public void paintComponent(Graphics g)
  {

    Graphics2D g2 = (Graphics2D) g;

    LetterH letter1 = new LetterH();

    LetterE letter2 = new LetterE();

    LetterL letter3 = new LetterL();

    LetterO letter4 = new LetterO();

    letter1.draw(g2);
    letter2.draw(g2);
    letter3.draw(g2);
    letter4.draw(g2);

  }

}
