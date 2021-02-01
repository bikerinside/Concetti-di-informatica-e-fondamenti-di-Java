/*
 * P2.15 Scrivete un programma per traccia la faccia seguente, progettando le classi
 * FaceViewer e FaceComponent.
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class FaceComponent extends JComponent
{

  public void paintComponent(Graphics g)
  {
    // recupera Graphics2D
    Graphics2D g2 = (Graphics2D) g;
    //  faccia
    Ellipse2D.Float face = new Ellipse2D.Float(45, 30, 100, 100);
    // occhio sinistro
    Ellipse2D.Float leftEye = new Ellipse2D.Float(60, 50, 20, 20);
    // occhio destro
    Ellipse2D.Float rightEye = new Ellipse2D.Float(110, 50, 20, 20);
    // bocca
    Line2D.Float mouth = new Line2D.Float(60, 90, 130, 90);
    // disegna la faccia
    g2.draw(face);
    // disegna l'occhio sinistro
    g2.draw(leftEye);
    // disegna l'occhio destro
    g2.draw(rightEye);
    // disegna la bocca
    g2.draw(mouth);

  }

}
