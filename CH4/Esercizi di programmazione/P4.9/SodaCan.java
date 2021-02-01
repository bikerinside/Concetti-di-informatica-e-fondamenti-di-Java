/*

Realizzate una classe SodaCan(lattina di bibita) il cui costruttore riceve
l'altezza e il diametro della lattina. Fornite i metodi getVolume() e getSurface()
nonché una classe SodaCanTester per il collaudo.

*/

public class SodaCan
{

  public SodaCan(double height, double diameter)
  {

    this.height = height;

    this.diameter = diameter;

  }

  public double getSurfaceArea()
  {

    double radius = diameter / 2.0;

    return 2 * PI * radius * (radius + height);

  }

  public double getVolume()
  {

    double radius = diameter / 2.0;

    return PI * (radius * radius) * height;

  }

  public final static double PI = 3.141592653589793;

  private double height;

  private double diameter;

}
