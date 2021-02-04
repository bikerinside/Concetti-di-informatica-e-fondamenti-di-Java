public class Grade
{

  public Grade(String grade)
  {

    this.grade = grade;

  }

  public double getNumericalGrade()
  {

    if(grade.equals("A") || grade.equals("A-") || grade.equals("A+"))
    {

      if(grade.equals("A+")) return 4.0;

      else if(grade.equals("A")) return 3.70;

      else return 3.40;

    }

    else if(grade.equals("B") || grade.equals("B-") || grade.equals("B+"))
    {

      if(grade.equals("B+")) return 3.0;

      else if(grade.equals("B")) return 2.70;

      else return 2.40;

    }

    else if(grade.equals("C") || grade.equals("C-") || grade.equals("C+"))
    {

      if(grade.equals("C+")) return 2.0;

      else if(grade.equals("C")) return 1.70;

      else return 1.40;

    }

    else if(grade.equals("D") || grade.equals("D-") || grade.equals("D+"))
    {

      if(grade.equals("D+")) return 1.0;

      else if(grade.equals("D")) return 0.70;

      else return 0;

    }

    else if(grade.equals("F"))
    {

      return 0;

    }

    else return -1;

  }

  private String grade;

}

/*
The following grade are inspire to this page
http://www.science.smith.edu/~jorourke/240/Grading.html
*/
