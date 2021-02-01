/*
Scrivete un programma per visualizzare gli anelli olimpici. 
Colorate gli anelli con i colori corretti (blu, nero, rosso, giallo e verde, 
procedendo da sinistra a destra e dall’alto in basso), 
progettando le classi OlympicRing, OlympicRingViewer e OlympicRingComponent.
*/

import javax.swing.JFrame;

public class OlympicRingViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final int FRAME_WIDTH = 300;
      final int FRAME_HEIGHT = 230;

      frame.setSize(300, 230);
      frame.setTitle("OlympicRingViewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      OlympicRingComponent component = new OlympicRingComponent();
      frame.add(component);

      frame.setVisible(true);
  }
}
