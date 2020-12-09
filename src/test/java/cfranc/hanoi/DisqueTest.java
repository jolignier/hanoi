package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {
	
	Disque dSmall = new Disque(1);
	Disque dMedium = new Disque(2);
	//Disque dTall = new Disque(3);

	//@Test
	//public void testCompareTo() {
		//Disque petit = new Disque(1);
		//Disque moyen = new Disque(2);
		//Disque grand = new Disque(3);
		//assertEquals(-1, petit.compareTo(moyen));
		//assertEquals(-1, moyen.compareTo(grand));
		//TODO : à compléter

		// Les fonctions de tests comprenant plusieurs assertion peuvent être
		// scindés en plusieurs fonctions de test ne comprenant qu'une assertion
		// On peut considérer deux approches quand aux disques de mêmes taille :
			// 1. Ce n'est pas représentatif du contexte global d'utilisation et ne peut pas arriver dans le jeu de Hanoi
			// 2. On effectue les tests par sécurité et on rentre possiblement dans le sur-test

		// La fonction testCompareTo n'a donc plus lieu d'être en découpant
		// en plusieurs fonctiions et permet une meilleure lisibilté


	//}

	@Test
	public void compareTo_SmallerThan_Negative(){
		int expected = -1;
		int actual = dSmall.compareTo(dMedium);
		assertEquals(expected, actual);
	}

	@Test
	public void compareTo_BiggerThan_Positive(){
		int expected = 1;
		int actual = dMedium.compareTo(dSmall);
		assertEquals(expected, actual);
	}

	@Test
	public void compareTo_SameSize_Zero(){
		int expected = 0;
		int actual = dSmall.compareTo(dSmall);
		assertEquals(expected, actual);
	}
}
