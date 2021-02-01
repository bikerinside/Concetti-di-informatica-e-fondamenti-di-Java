/* visulizza il disegno completo */

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
  Questo componente disegna il cerchio.
*/

public class BullsEyeComponent extends JComponent
{

  public void paintComponent(Graphics g)
  {
    Graphics2D g2 = (Graphics2D) g;

    int x = getWidth() - 200;
    int y = getHeight() - 200;

    BullsEye mainCircle = new BullsEye(x, y);

    mainCircle.draw(g2);

  }

}
