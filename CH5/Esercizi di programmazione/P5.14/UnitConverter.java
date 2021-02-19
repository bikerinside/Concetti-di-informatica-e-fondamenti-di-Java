/*

Esercizio P5.14. Scrivete un programma per la conversione di unità di misura.
Chiedete all'utente quale unità vuole convenire (in per pollice, ft per piede e mi per miglio)
e qual è l'unità di destinazione (mm, cm, m, km).
Suggerimento: Definite due oggetti di una classe UnitConverter che converta in metri e da metri.

Convert from? in

Convert to? mm

Value?

10

10 in = 254 mm

*/

public class UnitConverter
{

  public UnitConverter(String from, String to, double value)
  {

    this.from = from;

    this.to = to;

    this.value = value;

  }

  public double getConversion()
  {

    if (from.equals("in"))
    {


     if (to.equals("mm")) return value * 25.4;

     else if (to.equals("cm")) return value * 2.54;

     else if (to.equals("m")) return value * 0.0254;

     else if (to.equals("km")) return value * 0.0000254;

     else return -1;

   }

    else if(from.equals("ft"))
    {

      if (to.equals("mm")) return value * 305;

      else if (to.equals("cm")) return value * 30.48;

      else if (to.equals("m")) return value * 0.3048;

      else if (to.equals("km")) return value * 0.0003048;

      else return -1;

    }

    else if(from.equals("mi"))
    {

      if (to.equals("mm")) return value * 1609000;

      else if (to.equals("cm")) return value * 160934.4;

      else if (to.equals("m")) return value * 1609.344;

      else if (to.equals("km")) return value * 1.609344;

      else return -1;

    }

   else return -1;


  }


  private String from;
  private String to;
  private double value;

}
