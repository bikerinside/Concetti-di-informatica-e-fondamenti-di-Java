/*

Esercizio P3.9. Progettate una classe Bug che rappresend un insetto che si sposta lungo una linea orizzontale,
verso sinistra o verso destra. Inizialmente si sposta verso destra, ma si può girare e cambiare direzione;
ogni volta che si sposta, la sua posizione lungo la linea cambia di un'unità verso la direzione più recente.
Dotate la classe di un cosfruttore

public Bug(int initialPosition)

e dei metodi

public void turn()
public void move()
public int getPosition()

Ecco un esempio di utilizzo;

Bug bugsy = new Bug(10);
bugsy.move(); // ora si trova nella posizione 11
bugsy.tum();
bugsy.moveO; // ora si trova nella posizione 10

La classe BugTester deve costruire un insetto, farlo muovere e girare alcune volte,
poi visualizzare la posizione effettiva e quella prevista.

*/

public class BugTester
{

  public static void main(String[] args)
  {

    Bug bugsy = new Bug(10);

    bugsy.move(); // 11
    bugsy.move(); // 12

    bugsy.turn();

    bugsy.move(); // 11
    bugsy.move(); // 10

    bugsy.turn();

    bugsy.move(); // 11
    bugsy.move(); // 12

    System.out.println("Bug position = " + bugsy.getPosition());
    System.out.println("Expected = 12");

    System.exit(0);

  }

}
