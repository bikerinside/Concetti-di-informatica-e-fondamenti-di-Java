/*
*  P2.14 Scrivete un programma che riempia  una finestra con una grande Elllisse,
*  che tocchi i bordi della finestra e che sia riempita con il vostro colore preferito.
*  L'ellisse  deve ridimensionarsi automaticamente quando si ridimensiona la finestra
*/

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.awt.Color;

public class EllipseComponent extends JComponent
{

  public void paintComponent(Graphics g)
  {
    // recupera Graphics2D
    Graphics2D g2 = (Graphics2D) g;
    // dichiaro un oggetto di tipo Ellipse2D.Float e lo costruisco con posizione al centro della fineatra JFrame
    Ellipse2D.Float ellipse = new Ellipse2D.Float(0,0,getWidth(),getHeight());
    // setto il colore a rosso
    g2.setColor(Color.RED);
    // riempio la figura
    g2.fill(ellipse);
    // disegno la figura
    g2.draw(ellipse);

  }

}
