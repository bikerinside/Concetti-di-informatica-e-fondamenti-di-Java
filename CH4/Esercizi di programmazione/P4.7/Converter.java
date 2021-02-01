/*
Scrivete un programma che chieda all'utente una misura in metri e che poi la
converta in miglia, piedi e pollici. Definite questa classe

public class Converter
{

  Costruisce un convertitore fra unità di misura.
  @param aConversionFactor il fattore moltplicatore per convertire
        nell'unità desiderata

  public Converter(double aConversionFactor){...}
  Converte una misura da un'unità  a un'altra.
  @param fromMeasurement la misura da convertire
  @return il valore d'ingresso convertito

  public double convertTo(double fromMeasurement) {...}

  Nella classe ConverterTester costruire e collaudate il seguente oggetto:

  final double MILE_TO_KM = 1.609;
  Converter milesToMeters = new Converter(1000 * MILES_TO_KM);

}
*/

import java.lang.Math;

public class Converter
{

  public Converter(double aConversionFactor)
  {

    this.conversionFactor = aConversionFactor;

  }

  public double convertTo(double fromMeasurement)
  {

    return conversionFactor * fromMeasurement;

  }

  private double conversionFactor;

}
