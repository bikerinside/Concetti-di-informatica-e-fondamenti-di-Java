import java.util.Scanner;

public class GradeTester
{

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a letter grade: ");

    String grade = input.nextLine();

    Grade myGrade = new Grade(grade);

    if(myGrade.getNumericalGrade() == -1)
      System.out.println("Grade inserted not valid!");

    else
      System.out.println("The numeric value is " + myGrade.getNumericalGrade());

  }

}
