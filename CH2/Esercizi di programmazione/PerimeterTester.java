/*
* P2.2
* Scrivere una programma PerimeterTester che costruisca un oggetto Rectangle, ne
* calcoli il perimetro e lo visualizzi. Usate i metodi getWidth e getHeight e visualizzate
* anche il valore previsto.
*
*/

import java.awt.Rectangle;

public class PerimeterTester
{

  public static void main(String[] args)
  {

    Rectangle box = new Rectangle(0, 0, 20, 30);

    System.out.println("Perimetro = " + 2 * (box.getWidth() + box.getHeight()));
    System.out.println("Previsto = " + 2 * (20 + 30));

    System.exit(0);

  }

}
