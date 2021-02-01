/*
Esercizio P1.6. Scrivete un programma SumlOReciprocals che calcoli e visualizzi la somma dei numeri reciproci,
1/1 + 1/2+ ...+ 1/10. È più difficile di quanto sembri. Provate a scrivere il programma e controllate il risultato:
probabilmente non sarà corretto. Poi scrivete i numeri nella forma in virgola mobile: 1.0, 2.0, ... 10.0
ed eseguite nuovamente il programma.
Siete in grado di spiegare la differenza dei risultati? Esamineremo questo fenomeno nel Capitolo 4.
*/

public class Sum10reciprocals
{

  public static void main(String[] args)
  {
    // la frazione è troncata
    System.out.println(1/1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 + 1/7 + 1/8 + 1/9 + 1/10);
    // qui no
    System.out.println(1.0 + 0.5 + 0.33 + 0.25 + 0.2 + 0.16 + 0.14 + 0.12 + 0.11 + 0.1);

    System.exit(0);

  }

}
