/* 
Esercizio P5.4. Scrivete un programma che stampi la domanda "Vuoi continuare?" e che attenda dati dall'utente.
Se l'utente immette "S", "Sì", "OK", "Certo" o "Perché no?", stampate l'OK". Se l'utente scrive "N" o "No", stampate "Fine".
Negli altri casi, stampate "Dato non corretto". Non considerate differenze tra maiuscolo e minuscolo, quindi anche "s" e "sì" sono validi.
Scrivete allo scopo una classe YesNoChecker.
*/

import java.util.Scanner;

public class ContinueAsk
{

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.println("Vuoi continuare ?");

    String answer = input.nextLine();

    YesNoChecker check = new YesNoChecker(answer);

    System.out.println(check.getAnswer());

  }

}
