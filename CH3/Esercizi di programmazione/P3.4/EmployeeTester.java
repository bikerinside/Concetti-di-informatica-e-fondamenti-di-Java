/*
Esercizio P3.4. Progettate e realizzate una classe Employee (dipendente).
Ciascun dipendente ha un nome (una stringa) e uno stipendio (di tipo double).
Scrivete un costruttore con due parametri

public Employee(String employeeName, double cumentSalary)

e i metodi

public String getName()

public double get8alary()

public void raiseSalary(double byPercent)

Tali metodi forniscono il nome e lo stipendio del dipendente e ne aumentano il salario della percentuale indicata.
Ecco un esempio di utilizzo:

Employee harry = new Employee("Hacker, Harry", 50000); 

harry.raiseSalary(10); // Harry ottiene un aumento del 10%

Progettate anche una classe EmployeeTester che collaudi tutti i metodi.
*/

public class EmployeeTester
{

  public static void main(String[] args)
  {

    Employee harry = new Employee("Hacker, Herry", 50000);

    System.out.println(harry.getName());

    System.out.println(harry.getSalary());

    harry.raiseSalary(10);

    System.out.println(harry.getSalary());

    System.exit(0);

  }

}
