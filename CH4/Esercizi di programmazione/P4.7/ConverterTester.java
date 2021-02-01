import java.util.Scanner;

public class ConverterTester
{

  public static void main(String[] args)
  {

    final double METER_TO_MILE = 0.00062137119;
    final double METER_TO_FEET = 3.28084;
    final double METER_TO_INCH = 39.370078;
        // costruisce un oggetto Converter
    Converter metersToMiles = new Converter(METER_TO_MILE);
    Converter metersToFeets = new Converter(METER_TO_FEET);
    Converter metersToInches = new Converter(METER_TO_INCH);

    Scanner input = new Scanner(System.in);

    System.out.print("Inserisci una lunghezza in metri: ");

    double numberToConvert = input.nextDouble();

    System.out.println(numberToConvert + " m in miglia  = " + metersToMiles.convertTo(numberToConvert));
    System.out.println(numberToConvert + " m in piedi   = " + metersToFeets.convertTo(numberToConvert));
    System.out.println(numberToConvert + " m in pollici = " + metersToInches.convertTo(numberToConvert));
    System.exit(0);

  }


}
