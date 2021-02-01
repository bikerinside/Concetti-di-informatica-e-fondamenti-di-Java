/*
* Esercizio P2.13 Scrivete un programma che disegni due quadrati, uni interamente rosa e uno
* viola. Usate un colore standard per il primo e un colore personalizzato per l'altro.
* Progettate le classi TwoSquareViewer e TwoSquareComponent.
*/
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;

public class TwoSquareComponent extends JComponent
{

  public void paintComponent(Graphics g)
  {
    // recupera Graphics2D
    Graphics2D g2 = (Graphics2D) g;
    // dichiara e costruisce un rettangolo
    Rectangle box1 = new Rectangle(50, 50, 50, 50);
    // istanzia un oggetto di tipo color e lo costruisce
    Color cremisi = new Color(220, 20, 60);
    // setta il colore per colorare il rettangolo
    g2.setColor(Color.PINK);
    // riempie il retangolo
    g2.fill(box1);
    // disegna il  primo rettangolo
    g2.draw(box1);
    // istanzia un oggetto Rectangle e lo costruisce
    Rectangle box2 = new Rectangle(120, 50, 50, 50);
    // setta il colore personalizzato
    g2.setColor(cremisi);
    // riempie il secondo quadrato
    g2.fill(box2);
    // disegna il secondo rettangolo
    g2.draw(box2);

  }

}
