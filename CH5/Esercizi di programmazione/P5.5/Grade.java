/*
ES. 16. Scrivete un programma che traduca un voto espresso in lettere nel corrispondente voto numerico. 1voti in lettere sono A, B, C, D e F,
eventualmente seguiti da un segno + o 1loro valori numerici sono, nell’ordine, 4,3,2,1 e 0.1 voti F+ e F- non esistono.
Un segno + aumenta il voto numerico di 0.3, mentre un segno - lo diminuisce della stessa quantità. 1voto A+ è comunque uguale a 4.0.
Enter a letter grade: B- The numeric value is 2.7.
*/

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
