/*
Esercizio P2.il. Scrivete un programma grafico per disegnare il vostro nome in rosso,
centrandolo all'interno di un rettangolo blu. Progettate le classi NameViewer e NameComponent.
*/
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;

public class ColorNameComponent extends JComponent
{

  public void paintComponent(Graphics g)
  {
    // recupera Graphics2D per scrivere il nome nel rettangolo
    Graphics2D colorName = (Graphics2D) g;
    // imposta il colore nero
    colorName.setColor(Color.BLACK);
    // disegna la stringa contente il nome nella posizione desiderata
    colorName.drawString("BLACK", 0, 10);
    // imposta il colore blue
    colorName.setColor(Color.BLUE);
    // disegna la stringa contente il nome nella posizione desiderata
    colorName.drawString("BLUE", 0, 25);
    // imposta il colore cyan
    colorName.setColor(Color.CYAN);
    // disegna la stringa contente il nome nella posizione desiderata
    colorName.drawString("CYAN", 0, 40);
    // imposta il colore gray
    colorName.setColor(Color.GRAY);
    // disegna la stringa contente il nome nella posizione desiderata
    colorName.drawString("GRAY", 0, 55);
    // imposta il colore dark grey
    colorName.setColor(Color.DARK_GRAY);
    // disegna la stringa contente il nome nella posizione desiderata
    colorName.drawString("DARK_GREY", 0, 70);
    // imposta il colore LIGHT GREY
    colorName.setColor(Color.LIGHT_GRAY);
    // disegna la stringa contente il nome nella posizione desiderata
    colorName.drawString("LIGHT_GRAY", 0, 85);
    // imposta il colore green
    colorName.setColor(Color.GREEN);
    // disegna la stringa contente il nome nella posizione desiderata
    colorName.drawString("GREEN", 0, 100);
    // imposta il colore MAGENTA
    colorName.setColor(Color.MAGENTA);
    // disegna la stringa contente il nome nella posizione desiderata
    colorName.drawString("MAGENTA", 0, 115);
    // imposta il colore orange
    colorName.setColor(Color.ORANGE);
    // disegna la stringa contente il nome nella posizione desiderata
    colorName.drawString("ORANGE", 0, 130);
    // imposta il colore pink
    colorName.setColor(Color.PINK);
    // disegna la stringa contente il nome nella posizione desiderata
    colorName.drawString("PINK", 0, 145);
    // imposta il colore red
    colorName.setColor(Color.RED);
    // disegna la stringa contente il nome nella posizione desiderata
    colorName.drawString("RED", 0, 160);
    // imposta il colore yellow
    colorName.setColor(Color.YELLOW);
    // disegna la stringa contente il nome nella posizione desiderata
    colorName.drawString("YELLOW", 0, 175);

  }

}
