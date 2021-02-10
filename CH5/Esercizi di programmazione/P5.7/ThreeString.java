/*
Scrivete un programma che legga tre stringhe e le visualizzi in ordine lessicografico. Ad esempio:
Enter three strings:
Tom
Dick
Harry
The inputs in sorted order are:
Dick
Harry
Tom
*/

import java.util.Scanner;

public class ThreeString
{

  public static void main(String[] args)
  {

    String a, b, c;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first string : ");

    a = input.nextLine();

    System.out.print("Enter the second string : ");

    b = input.nextLine();

    System.out.print("Enter the thirth string : ");

    c = input.nextLine();
    // calculate the first string
    if(a.compareTo(b) < 0 && a.compareTo(c) < 0)
        System.out.println(a);

    else if(b.compareTo(a) < 0 && b.compareTo(c) < 0)
        System.out.println(b);

    else System.out.println(c);
    // calculate the second string
    if(a.compareTo(b) < 0 && a.compareTo(c) > 0)
          System.out.println(a);

    else if(b.compareTo(a) < 0 && b.compareTo(c) > 0)
          System.out.println(b);

    else System.out.println(c);
    // calculate the thirth string
    if(a.compareTo(b) > 0 && a.compareTo(c) > 0)
        System.out.println(a);

    else if(b.compareTo(a) > 0 && b.compareTo(c) > 0)
        System.out.println(b);

    else System.out.println(c);

  }
}
