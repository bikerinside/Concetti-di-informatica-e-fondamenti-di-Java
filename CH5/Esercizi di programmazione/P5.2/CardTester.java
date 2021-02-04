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
