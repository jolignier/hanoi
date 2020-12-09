package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {


	Disque d2 = new Disque(2);
	Disque d1 = new Disque(1);
	Tour tourNonVide = new Tour();

	/* TODO

            ==> GIVEN_WHEN_THEN <==
	 */
	@Test
	public void testempiler_TourPleine_FALSE() {
		Tour tour_pleine = new Tour(1);
		tour_pleine.empiler(d2);

		boolean expected = false;
		boolean actual = tour_pleine.empiler(d1);

		assertEquals(expected, actual);
	}

	@Test
	public void testempiler_TourVide_TRUE() {
		Tour tour_vide = new Tour();

		boolean expected = true;
		boolean actual = tour_vide.empiler(d1);

		assertEquals(expected, actual);
	}

	@Test
	public void testempiler_TourNonVideDisquePlusPetit_TRUE() {
		tourNonVide.empiler(d2);

		boolean expected = true;
		boolean actual = tourNonVide.empiler(d1);

		assertEquals(expected, actual);
	}

	@Test
	public void testempiler_TourNonVideDisquePlusGrand_FALSE() {
		tourNonVide.empiler(d1);

		boolean expected = false;
		boolean actual = tourNonVide.empiler(d2);

		assertEquals(expected, actual);
	}

}
