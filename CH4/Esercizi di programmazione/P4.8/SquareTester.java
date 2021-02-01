public class SquareTester
{

  public static void main (String[] args)
  {

    Square first = new Square(4.0);

    System.out.println("Lato = " + first.getSide() + "\nPerimetro = " + first.getPerimeter());
    System.out.println("Diagonale = " + first.getDiagonal());

    System.exit(0);

  }

}
