/*
Esercizio P2.6. Risolvete nuovamente l'Esercizio P2.5,
ma applicate due volte il metodo darken al colore predefinito rappresentato dall'oggetto
Color.RED .
Chiamate il vostro programma DarkerDemo.
*/

import java.awt.Color;

public class DarkerDemo
{

  public static void main(String[] args)
  {

    System.out.println(Color.RED);

    System.out.println(Color.RED.darker());
    // applica il metodo darker() due volte
    System.out.println(Color.RED.darker().darker());
    // il programma termina con successo
    System.exit(0);

  }

}
