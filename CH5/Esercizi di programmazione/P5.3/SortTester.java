import java.util.Scanner;

public class SortTester
{

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.print("Inserisci il primo numero: ");
    double a = input.nextDouble();

    System.out.print("Inserisci il secondo numero: ");
    double b = input.nextDouble();

    System.out.print("Inserisci il terzo numero: ");
    double c = input.nextDouble();

    SortThreeNumber tre_numeri = new SortThreeNumber(a, b, c);

    System.out.println(tre_numeri.getSmallest());
    System.out.println(tre_numeri.getMiddle());
    System.out.println(tre_numeri.getLargest());

  }

}

/*
Test cases:

1 2 3 ok

3 2 1 ok

1 3 2 ok

3 1 2 ok

2 3 1 ok

2 1 3 ok

*/
