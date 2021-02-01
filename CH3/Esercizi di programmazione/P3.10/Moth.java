public class Moth
{
  
  public Moth(double initialPosition)
  {

    position = initialPosition;

  }

  public void moveToLight(double lightPosition)
  {
    // distanza da raggiungere
    distance = lightPosition;
    // posizione precedente + la distanza da raggiunge a metà strada
    position = (position + distance) / 2;

  }

  public double getPosition()
  {

    return this.position;

  }

  /**
  la posizione della falena
  */
  private double position;
  /**
  la distanza da percorrere verso la fonte luminosa
  */
  private double distance;

}
