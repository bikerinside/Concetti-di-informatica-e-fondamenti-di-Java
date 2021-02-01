public class BalloonTester
{

  public static void main(String[] args)
  {

    Balloon santos = new Balloon();

    santos.addAir(100);

    System.out.println("Raggio = " + santos.getRadius());

    System.out.println("Volume = " + santos.getVolume());

    System.out.println("Area superficiale = " + santos.getSurfaceArea());

    santos.addAir(100);

    System.out.println("\nRaggio = " + santos.getRadius());

    System.out.println("Volume = " + santos.getVolume());

    System.out.println("Area superficiale = " + santos.getSurfaceArea());

  }

}
