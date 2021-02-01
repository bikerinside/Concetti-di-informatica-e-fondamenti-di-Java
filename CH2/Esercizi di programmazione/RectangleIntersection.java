/*
Esercizio P2.4. Il metodo intersection calcola l'intersezione di due rettangoli, ovvero il rettangolo formato dalla sovrapposizione
parziale di altri due rettangoli. Il metodo viene invocato in questo modo:

Rectangle r3 = r1.intersection(r2);

Scrivete un programma che costruisca due oggetti rettangolo, li visualizzi come nell'Esercizio P2.3 e quindi
visualizzi Soggetto che descrive la loro intersezione. Il programma visualizza il risultato anche quando i rettangoli non si sovrappongono: 
aggiungete un commento al codice che spieghi come si può capire se il rettangolo risultante è vuoto.
*/

import java.awt.Rectangle;

public class RectangleIntersection
{

  public static void main(String[] args)
  {
    // costruisce un oggetto di tipo Rectangle
    Rectangle r1 = new Rectangle(10, 10, 20, 50);
    // stampa le informazioni del rettangolo r1
    System.out.println(r1);
    // costruisce un altro oggetto di tipo Rectangle
    Rectangle r2 = new Rectangle(10, 10, 50, 20);
    // stampa le informazioni del rettangolo r2
    System.out.println(r2);
    // crea una variabile oggetto Rectangle e memorizza l'output del metodo intersection
    Rectangle r3 = r1.intersection(r2);
    // stampa le informzioni di r3
    System.out.println(r3);
    // il programma termina con successo
    System.exit(0);

  }

}
// N.B. se i rettangoli non si interesacano allora i valori width e height saranno o negativi o pari a 0
