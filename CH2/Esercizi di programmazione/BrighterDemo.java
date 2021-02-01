/*
Esercizio P2.5. Nella libreria Java un colore viene specificato mediante le sue tre componenti (rosso, verde e blu),
con valori numerici compresi tra O e 255. Scrivete un programma BrighterDemo che costruisca un oggetto di tipo Color con i valori di rosso,
verde e blu rispettivamente uguali a 50, 100 e 150.
Successivamente, applicate il metodo brighter e visualizzate i valori delle tre componenti del colore risultante
(non vedrete veramente il colore: per visualizzare i colori, consultate il Paragrafo 2.13).
*/

import java.awt.Color;

public class BrighterDemo
{

  public static void main(String[] args)
  {

    Color colore = new Color(50, 100, 150);

    System.out.println(colore.brighter());

    System.exit(0);

  }

}
