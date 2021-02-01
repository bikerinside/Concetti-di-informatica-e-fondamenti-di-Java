/*
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameTester
{

  public static void main(String[] args)
  {

    JFrame frame = new JFrame();
    frame.setSize(200, 200);
    JTextField text = new JTextField("Hello, World!");
    text.setBackground(Color.PINK);
    frame.add(text);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }

}

Ora, modificatelo nel modo seguente:
- Raddoppiate la dimensione della finestra ("frame")
- Fate in modo che il messaggio di saluto diventi "Hello, vostro nome!"
- Fate in modo che il colore dello sfondo ("background") diventi verde chiaro (rivedete l'esercizio P2.5)
*/

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameTester
{

  public static void main(String[] args)
  {

    JFrame frame = new JFrame("Frame Tester");
    frame.setSize(400, 400);
    JTextField text = new JTextField("Hello, Vincenzo!");
    text.setBackground(Color.GREEN);
    frame.add(text);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }

}
