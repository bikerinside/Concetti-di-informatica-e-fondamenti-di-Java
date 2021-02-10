public class LeapYear
{

  public LeapYear(int year)
  {

    this.year = year;

  }

  public boolean isLeapYear()
  {

    if (year % 4 == 0 && year % 100 != 0) return true;

    else if (year % 400 == 0) return true;

    else return false;

  }

  private int year;

}
