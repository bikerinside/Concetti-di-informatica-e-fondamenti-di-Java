import javax.swing.JOptionPane;
import java.lang.Double;

public class PairTester
{

  public static void main(String[] args)
  {

    String input = JOptionPane.showInputDialog("Inserisci il primo numero");

    double firstNumber = Double.parseDouble(input);

    input = JOptionPane.showInputDialog("Inserisci il secondo numero");

    double secondNumber = Double.parseDouble(input);

    System.out.println("Primo = " + firstNumber + " secondo = " + secondNumber);

    Pair pari = new Pair(firstNumber, secondNumber);

    String risultato  = "Primo numero inserito = " + firstNumber + "\nSecondo numero inserito = " + secondNumber + "\nsomma = " + pari.getSum() + "\ndifferenza = " + pari.getSubtraction() + "\nprodotto = " + pari.getMultiplication();
    String risultato2 = "\nmedia = " + pari.getAverage() + "\nValore assoluto della differenza = " + pari.getAbs() + "\nmassimo = " + pari.getMax() + "\nminimo = " + pari.getMin();

    JOptionPane.showMessageDialog(null, risultato + risultato2, "PairTester",JOptionPane.PLAIN_MESSAGE);

    System.exit(0);

  }

}
