/*
Scrivete un programma che traduca un numero compreso tra 0 e 4 nel voto letterale più vicino,
usando le regole definite nell’esercizio precedente. Ad esempio, il numero 2.8 (che potrebbe essere la media di più voti)
deve essere convertito in B-. Risolvete i casi di parità in favore del voto migliore: ad esempio,
2.85 deve essere convertito in B. Progettate la classe G r a d e dotata del metodo getLetterGrade.
*/

public class Grade
{

  public Grade(String grade)
  {

    this.grade = grade;

  }

  public Grade(double gradeNum)
  {

    this.gradeNum = gradeNum;

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

  public String getLetterGrade()
  {

    if(gradeNum >= 3.3 && gradeNum <= 4)
    {

      if(gradeNum >= 3.7) return "A+";

      else if(gradeNum >= 3.4 && gradeNum <= 3.6) return "A";

      else return "A-";

    }

    else if(gradeNum >= 2.23 && gradeNum <= 3.3)
    {

      if(gradeNum >= 2.7) return "B+";

      else if(gradeNum >= 2.4 && gradeNum <= 2.6) return "B";

      else return "B-";

    }

    else if(gradeNum >= 1.23 && gradeNum <= 2.3)
    {

      if(gradeNum >= 1.7) return "C+";

      else if(gradeNum >= 1.4 && gradeNum <= 1.6) return "C";

      else return "C-";

    }

    else if(gradeNum >= 0.2 && gradeNum <= 1.3)
    {

      if(gradeNum >= 0.7) return "D+";

      else if(gradeNum >= 0.4 && gradeNum <= 0.6) return "D";

      else return "D-";

    }

    else if(gradeNum >= 0.0 && gradeNum <= 0.3)
    {

      return "F";

    }

    else return "Invalid number grade!";

  }

  private String grade;
  private double gradeNum;

}

/*
The following grade are inspire to this page
http://www.science.smith.edu/~jorourke/240/Grading.html
*/
