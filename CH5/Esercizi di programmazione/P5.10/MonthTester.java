import java.util.Scanner;

public class MonthTester
{

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a month(1 - 12): ");

    int numeroMese = input.nextInt();

    Month mese = new Month(numeroMese);

    if(mese.getDays() == -1) 
      System.out.println("Mese non valido");

    else 
      System.out.println(mese.getDays() + " days");

    System.exit(0);

  }
}