import java.util.Scanner;

public class QuadraticEquationTester
{

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.print("Insert first coefficient: ");
    double c1 = input.nextDouble();

    System.out.print("Insert second coefficient: ");
    double c2 = input.nextDouble();

    System.out.print("Insert thirth coefficient: ");
    double c3 = input.nextDouble();

    QuadraticEquation firstEQ = new QuadraticEquation(c1, c2, c3);

    if(firstEQ.hasSolutions())
      System.out.println("\nhas solutions");

    else
      System.out.println("\nit has no solutions");

    System.out.println("X1 = " + firstEQ.getSolution1());
    System.out.println("x2 = " + firstEQ.getSolution2());

  }

}
