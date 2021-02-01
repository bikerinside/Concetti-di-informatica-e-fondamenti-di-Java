/*
Esercizio P3.10. Progettate una classe Moth che rappresenti una falena che si sposta lungo una linea retta,
ricordando la propria posizione e la distanza da un'origine prefissata. Quando si sposta verso una sorgente luminosa,
la sua nuova posizione viene a trovarsi a metà strada tra quella precedente e la posizione della sorgente luminosa.
Dotate la classe di un costruttore

public Moth(double initialPosition)

e dei metodi

public void moveToLight(double lightPosition) 
public double getPosition()

La classe MothTester deve costruire una falena, farla muovere verso un paio di sorgenti luminose,
poi visualizzare la posizione effettiva e quella prevista.
*/

public class MothTester
{

  public static void main(String[] args)
  {

    Moth mothsy = new Moth(10.5);

    mothsy.moveToLight(10);
    mothsy.moveToLight(10);
    mothsy.moveToLight(10);

    System.out.println(mothsy.getPosition());

    System.out.println("Expected = 10.0625");

  }

}
