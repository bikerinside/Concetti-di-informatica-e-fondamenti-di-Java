/*
* Esercizio P2.10. Scrivete un programma HollePrinter che scambi tra loro le lettere "e" e "o” in una stringa, 
* usando ripetutamente il metodo replace. Fate vedere che la stringa "Hello, World !" si trasforma in "Holle, Werld !".
*/

public class HollePrinter
{

  public static void main(String[] args)
  {

    System.out.println("Hell".replace("e","o") + "o, World!".replace("o","e"));

    System.exit(0);

  }

}
