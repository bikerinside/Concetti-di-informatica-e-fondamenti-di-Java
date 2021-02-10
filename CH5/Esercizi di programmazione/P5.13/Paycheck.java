/*
Esercizio P5.13. Scrivete un programma che riceva il nome e la retribuzione oraria di un dipendente.
Quindi, chiedete quante ore ha lavorato il dipendente la scorsa settimana.
Assicuratevi di accettare le frazioni di ora e calcolate la retribuzione.
Eventuali straordinari (oltre le 40 ore settimanali) vanno pagati nella misura del 150 per cento rispetto alla retribuzione normale.
Risolvete il problema scrivendo una classe Paycheck.
*/

public class Paycheck
{

  public Paycheck(String name, double hours)
  {

    this.name = name;

    this.hours = hours;

  }

  public double getPay()
  {

    if(hours > 0.00 && hours <=  STD_HRS)
      return (hours * SALARY);

    else if(hours > STD_HRS)
      return ((hours - STD_HRS) * EXTRA_SALARY) + (STD_HRS * SALARY);
    // this means user entered negative hours.
    else return -1;

  }

  private double hours;

  private String name;

  final static double SALARY = 19.33;
  final static double EXTRA_SALARY = 29.00;
  final static double STD_HRS = 40.00;

}
