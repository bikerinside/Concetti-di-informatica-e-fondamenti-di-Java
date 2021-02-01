/*
Esercizio P3.il. Progettate e realizzate una classe RoachPopulation che simuli la crescita di una popolazione di scarafaggi.
Il costruttore riceve la dimensione della popolazione iniziale di scarafaggi.
Il metodo breed simula un periodo di tempo in cui la popolazione raddoppia.
B metodo spray simula una spmzzata di insetticida, che riduce la popolazione del 10%.
Il metodo getRoaches restituisce il numero attuale di scarafaggi.
Realizzate un programma di collaudo RoachSimulation che simuli una popolazione che inizia con 10 scarafaggi.
Raddoppiate la popolazione, spruzzate l'insetticida e stampate il numero di scarafaggi. Ripetete tre volte.
*/

public class RoachSimulator
{

  public static void main(String[] args)
  {

    RoachPopulation myColony = new RoachPopulation(10);

    myColony.breed();

    myColony.spray();

    System.out.println(myColony.getRoaches());

    myColony.breed();

    myColony.spray();

    System.out.println(myColony.getRoaches());

    myColony.breed();

    myColony.spray();

    System.out.println(myColony.getRoaches());

    System.exit(0);

  }

}
