/*

Scrivete un programma che legge un numnero interno e che lo scompone in una serie
di cifre singole in ordine inverso. Per esempio, il numero 16384 verrà visuliazzato come:
4
8
3
6
1

Potete ipotizzare che il numero non abbia più di cinque cifre e che non sia negativo.
Definite una classe DigitExtractor:

public class DigitExtractor
{

  Costruisce un estrattore di cifre che restituisce le cifre di un numero intero
  di ordine inverso
  @param anInteger il numero da scomporre in cifre

  public DigitExtractor(int anInteger) {...}

  Restituisce la prossima cifra estratta.
  @return la prossima cifra

  public  double nextDigiti() {...}

}

Nella classe principale DigitPrinter invocate cinque volte il metodo System.out.println(myExtractor.nextDigit())

*/

public class DigitExtractor
{

  public DigitExtractor(int anInteger)
  {

    number = anInteger;

    divisor = 1;

  }

  public int nextDigit()
  {

    digits = number / divisor;

    divisor *= 10;

    return digits % 10;

  }

  private int digits;
  //private int extractor;
  private int divisor;

  private int number;

}
