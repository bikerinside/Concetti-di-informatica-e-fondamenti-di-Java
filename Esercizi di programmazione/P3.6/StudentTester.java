/*

 ** Esercizio P3.6. Progettate e realizzate una classe Student (studente).
 Ai fini di questo esercizio, ciascuno studente ha un nome e un punteggio totale per i questionari a cui ha risposto.
 Fornite un costruttore appropriato e i metodi seguenti: getName(), per conoscere il nome; addQuiz(int score),
 per registrare il punteggio di un nuovo questionario;
 getTotalScore(), per conoscere il punteggio totale; getAverage3core( ),
 per ottenere la media dei punteggi. Per calcolare la media,
 dovete registrare anche il numero dei questionari a cui lo studente ha dovuto rispondere.
 Fornite una classe StudentTester che collaudi tutti i metodi.

*/

public class StudentTester
{

  public static void main(String[] args)
  {

    Student io = new Student("Hackerman", 0);

    System.out.println("Nome studente = " + io.getName());

    io.addQuiz(17);
    io.addQuiz(20);
    io.addQuiz(15);

    System.out.println("Media dei quiz sostenuti = " + io.getAverageScore());
    System.out.println("Somma totale dei punteggi dei quiz = " + io.getTotalScore());
    System.out.println("Numero totale dei quiz sostenuti = " + io.getTotalQuiz());

  }


}
