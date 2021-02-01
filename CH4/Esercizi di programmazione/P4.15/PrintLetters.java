/*
Scrivere lettere giganti. Una lettera H gigante si può visualizzare in questo modo:

*   *
*   *
*****
*   *
*   *

e può essere ottenuta dichiarando una stringa letterale come questa:

final String LETTER_H = "* *\n* *\n*****\n* *\n* *\n;

(ricordate che la sequenza di escape \n rappresenta il carattere newline,
dopo il quale i caratteri verranno scritti a partire da una riga nuova).
Definite stringhe simili per le lettere E, L e 0.
Poi, scrivete il seguente messaggio con lettere giganti:

H
E
L
L
0

*/

public class PrintLetters
{

  public static void main(String[] args)
  {

    LetterH letter1 = new LetterH();
    System.out.println(letter1);

    LetterE letter2 = new LetterE();
    System.out.println(letter2);

    LetterL letter3 = new LetterL();
    System.out.println(letter3);
    System.out.println(letter3);

    LetterO letter4 = new LetterO();
    System.out.println(letter4);

    System.exit(0);

  }
}
