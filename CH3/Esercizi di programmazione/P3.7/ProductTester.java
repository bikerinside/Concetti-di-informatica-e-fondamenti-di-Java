/*
* Esercizio P3.7. Progettate e realizzate una classe Produci (prodotto).
Ciascun prodotto ha un nome e un prezzo, come per esempio new Product ( " Tostapane ", 29.95).
Fornite i seguenti metodi: getName( ), per conoscere il nome del prodotto; getPrice ( ) , per conoscerne il prezzo; reducePrice ( ), per ridurne il prezzo. 
Scrivete un programma che crea due prodotti e ne stampa il nome e il prezzo, per poi ridurre i loro prezzi di $ 5.00 e stamparli nuovamente.
*/

public class ProductTester
{

  public static void main(String[] args)
  {

    Product prodotto1 = new Product("Tostapane", 29.95);
    Product prodotto2 = new Product("Caffettiera", 19.90);

    System.out.print(prodotto1.getName());
    System.out.println(" = " + prodotto1.getPrice());

    System.out.print(prodotto2.getName());
    System.out.println(" = " + prodotto2.getPrice());

    prodotto1.reducePrice();
    prodotto2.reducePrice();

    System.out.print("\n"+prodotto1.getName());
    System.out.println(" = " + prodotto1.getPrice());

    System.out.print(prodotto2.getName());
    System.out.println(" = " + prodotto2.getPrice());

    System.exit(0);

  }

}
