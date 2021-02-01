public class IceCreamConeTester
{

  public static void main(String[] args)
  {

    IceCreamCone gelato = new IceCreamCone(5, 3.10);

		System.out.println("Area superficiale laterale = " + gelato.getSurfaceArea());

		System.out.println("\nIl volume = " + gelato.getVolume());

    System.exit(0);

  }

}
