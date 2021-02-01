public class Letter
{

  public Letter(String sender, String receiver)
  {

    from = sender;

    to = receiver;

    body = "";

  }

  public void addLine(String line)
  {

    body = line;

  }

  public String getText()
  {

    String letter = "";

    letter = letter.concat("Dear " + to + ":\n\n" + body).concat("\nSincerely,\n\n" + from + "❤" + "\n");

    return letter;

  }

  private String from;

  private String to;

  private String body;

}
