/*
Realizzate una classe Balloon che rappresenti il modello di un pallone
di forma sferica riempito d'aria , il cui costruttore costruisce un pallone vuoto.
Fornite questi metodi:

- void addAir(double amount) aggiunge la quantità d'aria specificata
- double getVolume() restituisce il volume attuale
- double getSurfaceArea() restituisce l'area superficiale attuale
- double getRadius() restituisce il raggio attuale

Progettare poi, una classe BalloonTester che costruisca un pallone, vi aggiunga
100 cm3 di aria e collaudi nuovamente i tre metodi di accesso.

*/

import java.lang.Math;

public class Balloon
{

  public void addAir(double amount)
  {

    air += amount;

  }

  public double getVolume()
  {

    volume =  4.0/3.0 * PI * (radius * radius * radius);

    return Math.round(volume * 10000.00) / 10000.00;

  }

  public double getSurfaceArea()
  {

    surfaceArea = Math.round((4.0 * PI * (radius * radius * radius ) * 10000.00)) / 10000.00;

    return  Math.round(surfaceArea * 10000.00) / 10000.00;

  }

  public double getRadius()
  {

    radius = Math.cbrt((3 * air) / (4 * PI));

    return Math.round(radius * 10000.00) / 10000.00;

  }

  public final static double PI = 3.1415;

  private double air;

  private double radius;

  private double volume;

  private double surfaceArea;

}
