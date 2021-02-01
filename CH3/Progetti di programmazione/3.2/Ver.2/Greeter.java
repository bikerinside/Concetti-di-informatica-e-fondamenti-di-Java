public class Greeter
{

  public Greeter(String nameGreeter)
  {

    name = nameGreeter;
  }


  public String sayHello()
  {

    return "Hello, "  + name + "!";

  }

  public String sayGoodbye()
  {

    return "Goodbye, "  + name + "!";

  }

  public String refuseHelp()
  {

    String refuse = "";

    refuse = refuse.concat("I am sorry, ").concat(name + ". I am afraid I can't do that.");

    return refuse;
    
  }

  private String name;

}
