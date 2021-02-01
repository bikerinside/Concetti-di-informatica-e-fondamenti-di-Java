/*
Esercizio P1.2 Scrivete un programma FacePrinter che, usando i caratteri, visualizzi un viso,
auspicabilmente migliore di questo:

     /////
    | o o |
	 (|  ^  |)
   | \_/ |
   -----
Usate i commenti per indicare quando vengono visualizzati i capelli, le orecchie, la bocca e così via.
*/

public class FacePrinter
{

	public static void main(String[] args)
	{
		// capelli
		System.out.println("     /");
		System.out.println("   ///");
		System.out.println("  /////");
		// occhi
		System.out.println(" | o o |");
		// naso e orecchie
		System.out.println("@|  L  |@");
		// bocca
		System.out.println(" | ~~~ |");
		// mento
		System.out.println("  -----");
		// il programma termmina con successo
		System.exit(0);

	}

}
