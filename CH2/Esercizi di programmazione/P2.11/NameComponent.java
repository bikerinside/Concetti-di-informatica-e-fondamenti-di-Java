/*
Esercizio P2.il. Scrivete un programma grafico per disegnare il vostro nome in rosso,
centrandolo all'interno di un rettangolo blu. Progettate le classi NameViewer e NameComponent.
*/
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;

public class NameComponent extends JComponent
{

  public void paintComponent(Graphics g)
  {
    // recupera Graphics2D
    Graphics2D g2 = (Graphics2D) g;
    // creo un oggetto Rectangle per il rettangolo
    Rectangle box = new Rectangle(50,50,110,50);
    // setta al colore blu per il rettangolo
    g2.setColor(Color.BLUE);
    // disegna il rettangolo
    g2.draw(box);
    // riempie di blu il rettangolo
    g2.fill(box);
    // setta al colore rosso la stringa contenente il nome
    g2.setColor(Color.RED);
    // disegna la stringa contente il nome nella posizione desiderata
    g2.drawString("Vincenzo Rosario", 50, 80);

  }

}
