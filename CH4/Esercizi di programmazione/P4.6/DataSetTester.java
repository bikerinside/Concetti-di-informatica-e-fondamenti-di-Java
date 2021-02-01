public class DataSetTester
{

  public static void main (String[] args)
  {

    DataSet mySet = new DataSet();

    mySet.addValue(10);
    mySet.addValue(1);
    mySet.addValue(5);
    mySet.addValue(7);

    System.out.println("Smallest = " + mySet.getSmallest());
    System.out.println("Expected: 1");

    System.out.println("Largest = " + mySet.getLargest());
    System.out.println("Expected: 10");

    System.exit(0);

  }

}
