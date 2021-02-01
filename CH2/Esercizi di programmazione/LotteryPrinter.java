/*
 * Esercizio P2.8. Scrivete un programma LotteryPrinter che generi una combinazione vincente per una lotteria,
 * nella quale i giocatori possono scegliere 6 numeri (eventualmente ripetuti) compresi fra 1 e 49
 * (in una vera lotteria le ripetizioni non sono ammesse, ma non abbiamo ancora presentato gli strumenti di programmazione
 * che sarebbero necessari per gestire questo problema). Il vostro programma deve visualizzare una frase beneaugurale,
 * del tipo "Ecco la combinazione che ti farà ricco", seguita da una sequenza di 6 numeri casuali che
 * costituiscano una combinazione valida per la lotteria.
*/

import java.util.Random;

public class LotteryPrinter
{

  public static void main(String[] args)
  {

    Random number = new Random();

    System.out.println("\nEcco la combinazione che ti farà ricco");

    System.out.print(number.nextInt(48) + 1 + " ");

    System.out.print(number.nextInt(48) + 1 + " ");

    System.out.print(number.nextInt(48) + 1 + " ");

    System.out.print(number.nextInt(48) + 1 + " ");

    System.out.print(number.nextInt(48) + 1 + " ");

    System.out.println(number.nextInt(48) + 1 + "\n");

    System.exit(0);

  }

}
