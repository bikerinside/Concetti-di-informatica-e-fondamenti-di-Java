/*
Scrivete un programma che disegni la stringa “HELLO” utilizzando solo linee e cerchi. 
Non invocate il metodo drawString e non usate System.out. 
Progettate le classi LetterH, LetterE, LetterL e LetterO. 
*/

import javax.swing.*;

public class LettersViewer
{

  public static void main(String[] args)
  {

    JFrame frame = new JFrame();

    frame.setSize(300, 400);

    frame.setTitle("Saluto");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    LetterComponent component = new LetterComponent();

    frame.add(component);

    frame.setVisible(true);

  }

}
