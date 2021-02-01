/*
Esercizio P3.8. Progettate una classe per impaginare una semplice lettera.
Il costruttore riceve come parametri il nome del mittente e quello del destinatario:

public Letter(String from, String to)

Progettate un metodo per aggiungere una riga di testo al contenuto della lettera: public void addLine(String line)

Progettate un altro metodo che restituisca l'intero testo della lettera: public String getText()

Il testo della lettera ha il seguente formato:

Dear destinatario:
riga vuota
prima riga del contenuto della lettera
seconda riga del contenuto della lettera
...
ultima riga del contenuto della lettera
riga vuota
Sincerely
riga vuota
mittente.

Progettate anche un programma LetterPrinter che visualizzi questa lettera:

Dear John:

I am sorry we must part.
I wish you all the best.

Sincerely,

Mary

Costruite un esemplare della classe Letter e invocate due volte il metodo addLine.
Suggerimenti:
(l) Usate il metodo concat per costruire una stringa più lunga a partire da due stringhe più corte.
(2) La stringa speciale "\ntt rappresenta un carattere speciale per andare a capo.
Ad esempio, il seguente enunciato body = body.concat("Sincerely,").concat("\n"); aggiunge al contenuto della lettera la riga "Sincerely, ".
*/
public class LetterPrinter
{

  public static void main(String[] args)
  {

    Letter myletter = new Letter("Mary", "John");

    myletter.addLine("I am sorry, we must part.\nI wish you the best.\n");

    System.out.println(myletter.getText());

    System.exit(0);

  }

}
