public class GreeterTester
{

  public static void main(String[] args)
  {

    Greeter saluto1 = new Greeter("Dave");

    Greeter saluto2 = new Greeter("Jack");

    System.out.println(saluto1.sayHello());

    System.out.println(saluto2.sayHello());

    System.out.println(saluto1.sayGoodbye());

    System.out.println(saluto2.sayGoodbye());

    System.out.println(saluto1.refuseHelp());

    System.out.println(saluto2.refuseHelp());
    System.exit(0);

  }

}
