/*
Esercizio P2.3. Scrivete un programma FourRectanglePrinter che costruisca un oggetto Rectangle,
visualizzi la sua posizione invocando System, out.println (box) e quindi lo sposti e ne visualizzi la posizione per altre tre volte,
in modo che, se i rettangoli fossero disegnati, formerebbero un unico grande rettangolo:
  ______
 |__|__|
 |__|__|

*/

import java.awt.Rectangle;

public class FourRectanglePrinter
{

  public static void main(String[] args)
  {

    Rectangle box = new Rectangle(0, 0, 10, 30);
    // stampa le nuove informazioni del rettangolo
    System.out.println(box);
    // transla il rettangolo a destra della sua posizione di 30 unità
    box.translate(30,0);
    // stampa le nuove informazioni del rettangolo nella nuova posizione
    System.out.println(box);
    // transla il rettangolo di 15 unità in basso
    box.translate(0,15);
    // stampa le nuove informazioni del rettangolo nella nuova posizione
    System.out.println(box);
    // transla il rettangolo a sinistra di 30 unità dalla sua posizione attuale
    box.translate(-30,0);
    // stampa le nuove informazioni del rettangolo nella nuova posizione
    System.out.println(box);
    // il programma termina con successo
    System.out.exit(0);

  }

}
