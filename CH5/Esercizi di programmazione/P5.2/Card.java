public class Card

{

  public Card(String description)
  {

    this.description = description;

  }

  public String getDescription()
  {
    // if the string inserted start with a digit
    if(description.substring(0,1).equals("2"))
    {

      if(description.substring(1,2).equals("Q")) return "2 di Quadri";
      if(description.substring(1,2).equals("C")) return "2 di Cuori";
      if(description.substring(1,2).equals("P")) return "2 di Picche";
      if(description.substring(1,2).equals("F")) return "2 di Fiori";
      else return "Unknown";

    }

    else if(description.substring(0,1).equals("3"))
    {

      if(description.substring(1,2).equals("Q")) return "3 di Quadri";
      if(description.substring(1,2).equals("C")) return "3 di Cuori";
      if(description.substring(1,2).equals("P")) return "3 di Picche";
      if(description.substring(1,2).equals("F")) return "3 di Fiori";
      else return "Unknown";

    }

    else if(description.substring(0,1).equals("4"))
    {

      if(description.substring(1,2).equals("Q")) return "4 di Quadri";
      if(description.substring(1,2).equals("C")) return "4 di Cuori";
      if(description.substring(1,2).equals("P")) return "4 di Picche";
      if(description.substring(1,2).equals("F")) return "4 di Fiori";
      else return "Unknown";

    }

    else if(description.substring(0,1).equals("5"))
    {

      if(description.substring(1,2).equals("Q")) return "5 di Quadri";
      if(description.substring(1,2).equals("C")) return "5 di Cuori";
      if(description.substring(1,2).equals("P")) return "5 di Picche";
      if(description.substring(1,2).equals("F")) return "5 di Fiori";
      else return "Unknown";

    }

    else if(description.substring(0,1).equals("6"))
    {

      if(description.substring(1,2).equals("Q")) return "6 di Quadri";
      if(description.substring(1,2).equals("C")) return "6 di Cuori";
      if(description.substring(1,2).equals("P")) return "6 di Picche";
      if(description.substring(1,2).equals("F")) return "6 di Fiori";
      else return "Unknown";

    }

    else if(description.substring(0,1).equals("7"))
    {

      if(description.substring(1,2).equals("Q")) return "7 di Quadri";
      if(description.substring(1,2).equals("C")) return "7 di Cuori";
      if(description.substring(1,2).equals("P")) return "7 di Picche";
      if(description.substring(1,2).equals("F")) return "7 di Fiori";
      else return "Unknown";

    }

    else if(description.substring(0,1).equals("8"))
    {

      if(description.substring(1,2).equals("Q")) return "8 di Quadri";
      if(description.substring(1,2).equals("C")) return "8 di Cuori";
      if(description.substring(1,2).equals("P")) return "8 di Picche";
      if(description.substring(1,2).equals("F")) return "8 di Fiori";
      else return "Unknown";

    }

    else if(description.substring(0,1).equals("9"))
    {

      if(description.substring(1,2).equals("Q")) return "9 di Quadri";
      if(description.substring(1,2).equals("C")) return "9 di Cuori";
      if(description.substring(1,2).equals("P")) return "9 di Picche";
      if(description.substring(1,2).equals("F")) return "9 di Fiori";
      else return "Unknown";

    }

    else if(description.substring(0,2).equals("10"))
    {

      if(description.substring(2,3).equals("Q")) return "10 di Quadri";
      if(description.substring(2,3).equals("C")) return "10 di Cuori";
      if(description.substring(2,3).equals("P")) return "10 di Picche";
      if(description.substring(2,3).equals("F")) return "10 di Fiori";
      else return "Unknown";

    }
    //if the string inserted start with a letter
    else if(description.substring(0,1).equals("A"))
    {

      if(description.length() == 1) return "Asso";

      else
      {

        if(description.substring(1,2).equals("Q")) return "Asso di Quadri";
        if(description.substring(1,2).equals("C")) return "Asso di Cuori";
        if(description.substring(1,2).equals("P")) return "Asso di Picche";
        if(description.substring(1,2).equals("F")) return "Asso di Fiori";
        else return "Unknown";

      }

    }

    else if(description.substring(0,1).equals("D"))
    {

      if(description.length() == 1) return "Donna";

      else
      {

        if(description.substring(1,2).equals("Q")) return "Donna di Quadri";
        if(description.substring(1,2).equals("C")) return "Donna di Cuori";
        if(description.substring(1,2).equals("P")) return "Donna di Picche";
        if(description.substring(1,2).equals("F")) return "Donna di Fiori";
        else return "Unknown";

      }

    }

    else if(description.substring(0,1).equals("J"))
    {

      if(description.length() == 1) return "Jack";

      else
      {

        if(description.substring(1,2).equals("Q")) return "Jack di Quadri";
        if(description.substring(1,2).equals("C")) return "Jack di Cuori";
        if(description.substring(1,2).equals("P")) return "Jack di Picche";
        if(description.substring(1,2).equals("F")) return "Jack di Fiori";
        else return "Unknown";

      }

    }

    else if(description.substring(0,1).equals("R"))
    {

      if(description.length() == 1) return "Re";

      else
      {

        if(description.substring(1,2).equals("Q")) return "Re di Quadri";
        if(description.substring(1,2).equals("C")) return "Re di Cuori";
        if(description.substring(1,2).equals("P")) return "Re di Picche";
        if(description.substring(1,2).equals("F")) return "Re di Fiori";
        else return "Unknown";

      }

    }
    // if the string inserted doesn't start with coded letter/number
    else return "Unknown";
  }

  private String description;

}
