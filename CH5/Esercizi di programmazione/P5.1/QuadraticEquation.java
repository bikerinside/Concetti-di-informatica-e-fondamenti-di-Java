/*
Esercizio P5.1. Scrivete un programma che stampi tutte le soluzioni reali dell'equazione di secondo grado ax2 + bx+ c=0.
Leggete in ingresso i valori di a,b e c e usate la formula dell'equazione di secondo grado. Se il discriminante b2 - 4ac è negativo,
visualizzate un messaggio per segnalare che non esistono soluzioni reali.
Realizzate una classe QuadraticEquation il cui costruttore riceve i coefficienti a, b e c dell'equazione quadratica.
Fornite i metodi getSolutionl e getSolution2 che restituiscono le soluzioni, usando la formula quadratica, oppure O se non vi sono soluzioni.
Il metodo getSolutionl deve restituire la soluzione di valore minore.
Fornite, infine, il metodo boolean hasSolutions() che restituisce false se il discriminante è negativo.
*/

public class QuadraticEquation
{
  /**
  Costruttore che assegna ai campi dei coefficienti
  i valori inseriti dall'utente
  @param a il coefficiente x^2
  @param b il coefficiente x
  @param c il coefficiente c
  */
  public QuadraticEquation(double a, double b, double c)
  {

    this.a = a;
    this.b = b;
    this.c = c;

  }
  /**
  Calcola il discriminante dell'equazione da
  risolvere tramite i coeffiecienti inseriti dall'utente
  @return false se il discriminante è minore di zero
  @return true se il discriminante è maggiore di zero
  */
  public boolean hasSolutions()
  {

    discriminant = (b * b) - (4.0 * a * c);

    if (discriminant < 0.0)
        return false;

    else
        return true;

  }
  /**
  Calcola la prima soluzione dell'equazione
  @return la prima soluzione dell'equazione se il determinante è maggiore di 0
  @return 0 se il determinante è minore di 0
  */
  public double getSolution1()
  {

    if(this.hasSolutions())
      return (-1 * b) + (Math.sqrt(discriminant)) / (2.0 * a);

    else
      return 0.0;

  }
  /**
  Calcola la seconda soluzione dell'equazione
  @return la seconda soluzione dell'equazione se il determinante è maggiore di 0
  @return 0 se il determinante è minore di 0
  */
  public double getSolution2()
  {
    if(this.hasSolutions())
      return (-1 * b) - (Math.sqrt(discriminant)) / (2.0 * a);

    else
      return 0.0;

  }

  private double a;
  private double b;
  private double c;

  private double discriminant;

}
