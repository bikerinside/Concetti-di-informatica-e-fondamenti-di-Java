import java.util.Scanner;

public class GradeTester
{

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number grade: ");

    double grade = input.nextDouble();

    Grade myGrade = new Grade(grade);

    System.out.println("The letter value is " + myGrade.getLetterGrade());

  }

}
