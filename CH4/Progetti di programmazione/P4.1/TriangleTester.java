import java.util.Scanner;

public class TriangleTester
{

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.print("Insert x1 : ");
    double x1 = input.nextDouble();

    System.out.print("Insert y1 : ");
    double y1 = input.nextDouble();

    System.out.print("Insert x2 : ");
    double x2 = input.nextDouble();

    System.out.print("Insert y2 : ");
    double y2 = input.nextDouble();

    System.out.print("Insert x3 : ");
    double x3 = input.nextDouble();

    System.out.print("Insert y3 : ");
    double y3 = input.nextDouble();

    Triangle mio = new Triangle(x1,y1,x2,y2,x3,y3);

    System.out.println("Side A    = \t" + mio.sideA());
    System.out.println("Side B    = \t" + mio.sideB());
    System.out.println("Side C    = \t" + mio.sideC());
    System.out.println("Perimeter = \t" + mio.getPerimeter());
    System.out.println("Area      = \t" + mio.getArea());
    System.out.println("Alpha     = \t" + mio.getAlpha());
    System.out.println("Beta      = \t" + mio.getBeta());
    System.out.println("Gamma     = \t" + mio.getGamma());

  }

}
