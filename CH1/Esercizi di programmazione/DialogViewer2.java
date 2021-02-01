/*
Esercizio P1.8. Copiate ed eseguite il programma seguente:

import javax.swing.JOptionPane;

public class DialogViewer
{

    public static void main(String[] args)
    {

      String name = JOptionPane.showInputDialog("What is your name?");

      System.out.println (name);

      System.exit(0);

    }

}

Modificate poi il programma in modo che visualizzi il messaggio
"Hello, nome!" essendo nome ciò che è stato digitato dall'utente nella finestra di dialogo.
*/

import javax.swing.JOptionPane;

public class DialogViewer2
{

    public static void main(String[] args)
    {

      String name = JOptionPane.showInputDialog("What is your name ?");

      System.out.println("Hello, " + name);

      System.exit(0);

    }

}
