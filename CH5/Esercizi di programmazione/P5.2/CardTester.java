/*
Scrivete un programma che acquisisca dall’utente la descrizione di una carta da gioco. usando la seguente notazione abbreviata:
A Asso
2 . . . 10 D
J Jack
D Donna
R Re
Q Quadri
C Cuori
P Picche
F Fiori

Il programma deve visualizzare la descrizione completa della carta. Ad esempio:
Inserisci la descrizione della carta:
DP
Donna di picche

Progettate la classe Card il cui costruttore riceve come parametro la stringa che descrive la carta e
il cui metodo getDescription restituisca una stringa che descrive la carta, come specificato.
Se la stringa fornita come parametro di costruzione non rispetta il formato richiesto, il metodo getDescription
deve restituire la stringa "Unknown".
*/

import java.util.Scanner;

public class CardTester
{

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.println("Inserisci la carta: ");
    String nomecarta = input.nextLine();

    Card miacarta = new Card(nomecarta);

    System.out.println(miacarta.getDescription());

  }

}
