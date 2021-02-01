/**
Classe Employee che visualizza il nome e il salario
di un dipendente e ne aumenta il salario tramite la percentuale
*/

public class Employee
{
  /**
  costruisce un oggetto con nome e salario del dipendente
  @param employeeName Il nome dell'impiegato
  @param currentSalary il salario attuale dell'impiegato
  */
  public Employee(String employeeName, double currentSalary)
  {

    name   = employeeName;

    salary = currentSalary;

  }
  /**
  visulizza il nome dell'impiegato
  */
  public String getName()
  {

    return this.name;

  }
  /**
  visualizza il salario dell'impiegato
  */
  public double getSalary()
  {

    return this.salary;

  }
  /**
  aumenta il salario dell'impiegato in base alla percentuale
  */
  public void raiseSalary(double byPercent)
  {

    double rise = this.salary * byPercent / 100;

    this.salary = this.salary + rise;

  }

  /**
  nome dell'impiegato
  */
  private String name;
  /**
  il salario attuale dell'impiegato
  */
  private double salary;

}
