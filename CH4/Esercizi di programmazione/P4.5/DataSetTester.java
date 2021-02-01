public class DataSetTester
{

  public static void main (String[] args)
  {

    DataSet mySet = new DataSet();

    mySet.addValue(10);
    mySet.addValue(1);
    mySet.addValue(5);
    mySet.addValue(7);

    System.out.println("Sum = " + mySet.getSum());
    System.out.println("Expected: 23");

    System.out.println("Average = " + mySet.getAverage());
    System.out.println("Expected: 5.75");

    System.exit(0);

  }

}
