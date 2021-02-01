/*
* Esercizio P2.9. Scrivete un programma ReplaceTester che codifichi una stringa sostituendo tutte le lettere "i" con " ! " e tutte le lettere "s" con "$".
* Dimostrate di poter codificare correttamente la stringa "Mississippi", visualizzando il risultato prodotto e quello previsto.
*/

public class ReplaceTester
{

  public static void main(String[] args)
  {

    System.out.println("Mississippi".replace("i","!").replace("s","$"));

    System.out.println("Previsto: M!$$!$$!pp!");

    System.exit(0);

  }

}
