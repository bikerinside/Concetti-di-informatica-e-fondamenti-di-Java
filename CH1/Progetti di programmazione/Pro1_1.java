/*
Progetto 1.1. Questo progetto si basa sugli Esercizi P1.7 e PI.8. U vostro programma deve leggere il nome dell'utente,
poi visualizzare due finestre di dialogo in sequenza:
Per prima cosa, una finestra con inserimento dad che chieda: "What would you like me to do?"
Poi, una finestra che visualizzi il messaggio: "I?m sorry, nome. l'm afraid I can't do that."
Questo programma ignora i dati forniti in ingresso dall'utente: avrete una valutazione superiore se
 il vostro programma sarà in grado di leggere il nome dell'utente, generando poi un messaggio personalizzato.
*/

import javax.swing.JOptionPane;

public class Pro1_1
{

  public static void main(String[] args)
  {

      String name = JOptionPane.showInputDialog("What Would you like me to do ?");

      JOptionPane.showMessageDialog(null, "Hi " + name + ". have a nice day");

      System.exit(0);

  }

}
