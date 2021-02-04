import java.util.Scanner;

public class ContinueAsk
{

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.println("Vuoi continuare ?");

    String answer = input.nextLine();

    YesNoChecker check = new YesNoChecker(answer);

    System.out.println(check.getAnswer());

  }

}
