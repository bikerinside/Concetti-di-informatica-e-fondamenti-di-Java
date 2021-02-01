/* visulizza il disegno completo */

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
  Questo componente disegna case.
*/

public class HouseComponent extends JComponent
{

  public void paintComponent(Graphics g)
  {

    Graphics2D g2 = (Graphics2D) g;

    int x = getWidth() - 250;
    int y = getHeight() - 250;

    House firstHouse = new House(x, y, 80, 80);

    House secondHouse = new House(40,40,60,60);

    House thirthHouse = new House(300, 300, 40,40);

    firstHouse.draw(g2);
    secondHouse.draw(g2);
    thirthHouse.draw(g2);

  }

}
