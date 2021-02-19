import java.util.Scanner;

public class UnitConverterTester
{

  public static void main(String args[])
  {

    Scanner inputString = new Scanner(System.in);

    System.out.print("Convert from? ");

    String from = inputString.nextLine();

    System.out.print("Convert to? ");

    String to = inputString.nextLine();

    System.out.print("Value? ");

    double value = inputString.nextDouble();

    UnitConverter conversion = new UnitConverter(from, to, value);

    System.out.println(value + " " + from + " = " + conversion.getConversion() + " " + to);

  }
}
