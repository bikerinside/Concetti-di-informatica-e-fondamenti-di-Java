/**
Una classe studente che memorizza
il nome, il punteggio dei quiz, la media e il numero di quiz.
*/

public class Student
{
  // costruttore
  public Student(String studentName, int StudentScore)
  {

    name = studentName;

    score = StudentScore;

    quiz = 0;

  }

  public String getName()
  {

    return this.name;

  }

  public void addQuiz(int scoreQuiz)
  {

    this.score = this.score + scoreQuiz;

    this.quiz = this.quiz + 1;

  }

  public int getTotalScore()
  {

    return this.score;

  }

  public int getAverageScore()
  {

    return this.score / this.quiz;

  }

  public int getTotalQuiz()
  {

    return this.quiz;

  }

  private String name;

  private int score;

  private int quiz;

}
