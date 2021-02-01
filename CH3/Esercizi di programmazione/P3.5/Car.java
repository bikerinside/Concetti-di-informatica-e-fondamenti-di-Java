/**
Una classe che automobile
che calcola quanti Km si possono percorre con l litri di gas
*/
public class Car
{
  /**
  crea un oggetto automobile con gasLiters di benzina
  @param literkm litri per km
  */
  public Car(double literKm)
  {

    gasYield = literKm;

    gasTank = 0;

  }

  /**
  calcola e sottrae quanti litri di gas
  sono stati consumati per percorrere i km percorsi
  @param drivenKM i km percorsi con l'automobile
  */
  public void drive(double drivenKM)
  {

    double gasUsed =  drivenKM / gasYield;

    gasTank = gasTank - gasUsed;

  }
  /**
  aggiunge carburante al serbatoio
  @param liters i litri totali da aggiungere al serbatoio
  */
  public void addGas(double liters)
  {

    gasTank = gasTank + liters;

  }
  /**
  Ispezione il serbatoio del carburante
  e ritorna i litri rimanenti
  */
  public double getGasInTank()
  {

    return gasTank;

  }

  /**
  Totale litri carburante automobile
  */
  private double gasTank;
  /**
  i km percorsi con 1l di gas
  */
  private double gasYield;

}
