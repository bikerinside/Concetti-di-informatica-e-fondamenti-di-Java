import java.util.Scanner;

public class PaycheckTester
{

  public static void main(String[] args)
  {

    double minutes, hours;

    String nameEmployee;

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter name employee: ");

    nameEmployee = input.nextLine();

    System.out.print("Enter work hours: ");

    hours = input.nextDouble();

    Paycheck salario = new Paycheck(nameEmployee, hours);
    
    System.out.println(nameEmployee);

    if(salario.getPay() == -1) 
        System.out.println("Wrong hours format entered!");

    else
    System.out.println("$ " + ((salario.getPay() * 100.00) / 100.00));

  }

}
