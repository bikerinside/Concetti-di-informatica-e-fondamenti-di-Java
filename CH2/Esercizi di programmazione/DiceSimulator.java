/*
Esercizio P2.7. La classe Random realizza un generatore di numeri casuali,
cioè genera sequenze di numeri che appaiono essere casuali.
Per generare numeri interi casuali, dovete costruire un esemplare della classe Random, applicando poi il metodo nextlnt.
Ad esempio, l'invocazione generator.nextlnt(6) fornisce un numero casuale compreso tra O e 5.
Scrivete un programma DiceSimulator che usi la classe Random per simulare il lancio di un dado,
visualizzando un numero casuale compreso tra l e 6 ogni volta che viene eseguito.
*/

import java.util.Random;

public class DiceSimulator
{

  public static void main(String[] args)
  {

    Random dado = new Random();

    System.out.println(dado.nextInt(6) + 1);

    System.exit(0);

  }

}
