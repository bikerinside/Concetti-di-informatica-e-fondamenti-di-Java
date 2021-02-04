public class SortThreeNumber
{

  public SortThreeNumber(double a, double b, double c)
  {

    this.a = a;
    this.b = b;
    this.c = c;

  }

  public double getSmallest()
  {

    if(a < b && a < c) smallest = a;

    else if(b < a && b < c) smallest = b;

    else smallest = c;

    return smallest;

  }

  public double getMiddle()
  {

    if ((a > b && a < c) || (a > c && a < b)) middle = a;

    else if((b > a && b < c) || (b > c && b < a)) middle = b;

    else middle = c;

    return middle;

  }


  public double getLargest()
  {

    if(a > b && a > c) largest = a;

    else if(b > a && b > c) largest = b;

    else largest = c;

    return largest;

  }

  private double a;
  private double b;
  private double c;

  private double smallest;
  private double middle;
  private double largest;

}
