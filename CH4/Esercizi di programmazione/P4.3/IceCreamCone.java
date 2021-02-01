/*
Realizzate una classe IceCreamCone con i metodi getSurfaceArea()
e getVolume(). Nel costruttore specificate l'atella e il raggio del cono.
Fate attenzione nell'utilizzare la formula che calcola l'area superficiale:
dovreste considerare solamente l'area esterna laterale del cono,
che è aperto in cima per contere il gelato.
*/

import java.lang.Math;

public class IceCreamCone
{

  public IceCreamCone(double h, double r)
  {

    height = h;

    radius = r;

  }

  public double getSurfaceArea()
  {

    double apothem =  Math.sqrt((radius * radius) + (height * height));

    double lateralSurface = PI * radius * apothem;

    return lateralSurface;

  }

  public double getVolume()
  {

    double volumeCone = (PI * (radius * radius) * height) / 3.00;

    return volumeCone;

  }

  private double height;
  private double radius;

  public final static double PI = 3.141592653589793;

}
