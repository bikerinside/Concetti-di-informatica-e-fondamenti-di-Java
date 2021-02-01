/*
Esercizio P3.5. Progettate e realizzate una classe Car (automobile) con le proprietà seguenti.
Un'automobile ha una determinata resa del carburante (misurata in miglia/galloni o in litri/ chilometri:
scegliete il sistema che preferite) e una certa quantità di carburante nel serbatoio.
La resa è specificata dal costruttore e il livello iniziale del carburante è a zero.
Fornite questi metodi: un metodo drive per simulare il percorso di un'automobile per una certa distanza,
riducendo il livello di carburante nel serbatoio; un metodo getGasInTank,
per ispezionare il livello corrente del carburante; un metodo addGas, per fare rifornimento.
Ecco un esempio di utilizzo:
Car myHybrid = new Car(50); // 50 miglia per gallane
myHybrid.addGas(20); // carica 20 galloni di carburante
myHybrid.drive(100); // viaggia per 100 miglia
double gasLeft = myHybrid.getGasInTank()); // quantità di carburante rimasto

Potete ipotizzare che il metodo drive non venga mai invocato per una distanza maggiore di quella percorribile con il carburante disponibile.
Fornite una classe CarTester che collaudi tutti i metodi.
*/

public class CarTester
{

  public static void main(String[] args)
  {

    Car myHybrid = new Car(26.3); // 26,3 Km per litro

    myHybrid.addGas(1); // fa rifornimento con 1l di gas

    myHybrid.drive(26.3); // viaggia per 26.3 Km

    System.out.println(myHybrid.getGasInTank());

  }
}
