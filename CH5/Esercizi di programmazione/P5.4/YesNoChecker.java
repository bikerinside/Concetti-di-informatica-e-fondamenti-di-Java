public class YesNoChecker
{

  public YesNoChecker(String answer)
  {

    this.answer = answer;

  }

  public String getAnswer()
  {

    if(answer.equalsIgnoreCase("s") || answer.equalsIgnoreCase("sì") || answer.equalsIgnoreCase("ok"))
    {
      return "OK";
    }

    else if(answer.equalsIgnoreCase("Perché No?") || answer.equalsIgnoreCase("Certo"))
    {

      return "OK";

    }

    else if(answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("no"))
    {

      return "Fine";

    }

    else return "Dato non corretto";

  }

  private String answer;

}
