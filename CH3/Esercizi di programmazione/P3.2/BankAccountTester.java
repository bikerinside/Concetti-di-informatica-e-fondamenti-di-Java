/*
Classe di collaudo per la classe BankAccount.
Aggiungente alla classe BankAccount un metodo
void add addInterest(double rate)
Che aggiunga al conto gli interessi al tasso specificato.Ad esempio,
dopo l'esecuzione di questi enunciati

BankAccount momSavings = new BankAccount(1000);
momSavings.addInterest(10); // interessi al 10%

Il saldo momSavings è $ 1100. Progettate anche una classe BankAccountTester
che visualizzi il salvo finale e il suo valore previsto.
*/

public class BankAccountTester
{

  /**
  Collauda i metodi utilizzati dalla classe BankAccount.
  @param args non utilizzato
  */
  public static void main(String[] args)
  {

    BankAccount momSavings = new BankAccount(1000);

    momSavings.addInterest(10);

    System.out.println(momSavings.getBalance());

    System.out.println("Expected: 1100");

    System.exit(0);

  }

}
