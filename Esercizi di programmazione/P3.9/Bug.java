public class Bug
{

  public Bug(int initialPosition)
  {

    this.position = initialPosition;

    this.direction = 1;

  }
  /**
  cambia la direzione verso sinistra o verso destra
  in base a quella più recente sx = - dx = +
  */
  public void turn()
  {

    this.direction = this.direction * (-1);

  }
  /**
  sposta l'insetto in base alla direzione
  */
  public void move()
  {

    this.position = this.position + this.direction;

  }
  /**
  visualizza la posizone attuale
  @return la posizione attuale
  */
  public int getPosition()
  {

    return this.position;

  }
  /**
  La posizione dell'insetto
  */
  private int position;
  /**
  La direzione in cui sta andando
  */
  private int direction;

}
