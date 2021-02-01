import java.util.Scanner;

public class TimeIntervalTester
{

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the first time: ");
    int firstTime  = input.nextInt();

    System.out.println("Please enter the second time: ");
    int secondTime = input.nextInt();

    TimeInterval prova1 = new TimeInterval(firstTime, secondTime);
    System.out.print(prova1.getHours() + " hours " + prova1.getMinutes() + " minutes\n");

    System.exit(0);

  }

}
