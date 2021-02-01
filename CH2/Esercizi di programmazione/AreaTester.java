/*
* P2.1
* Scrivere una programma AreaTester che costruisca un oggetto Rectangle, ne
* calcoli l'area e la visualizzi. Usate i metodi getWidth e getHeight e visualizzate
* anche il valore previsto.
*
*/

import java.awt.Rectangle;

public class AreaTester
{

  public static void main(String[] args)
  {

    Rectangle box = new Rectangle(0, 0, 20, 30);

    System.out.println("Area = " + 2 * (box.getWidth() + box.getHeight()));
    System.out.println("Previsto = " + 2 * (20 + 30));

    System.exit(0);

  }

}
