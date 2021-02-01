public class RoachPopulation
{

  public RoachPopulation(int startSize)
  {

    population = startSize;

  }
  /**
  Raddoppia il numero di scarafaggi
  */
  public void breed()
  {

    population = population * 2;

  }
  /**
  Uccide il 10% degli scarafaggi
  */
  public void spray()
  {

    int deaths = (population * 10) / 100;

    population = population - deaths;

  }
  /**
  restiuisce il numero di scarafaggi
  */
  public int getRoaches()
  {

    return population;

  }
  /**
  il numero totale di scarafaggi
  */
  private int population;

}
