import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
	
	GradeBook g1, g2;

	@Before
	public void setUp() throws Exception {
		
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(15);
		g1.addScore(40);
		g2.addScore(10.5);
		g2.addScore(33);
		
	}

	@After
	public void tearDown() throws Exception {
		
		g1=g2=null;
		
	}

	@Test
	public void testAddScore() {
		
		System.out.println(g1.toString());

		assertTrue(g1.toString().equals("15.0 40.0 "));
		assertTrue(g2.toString().equals("10.5 33.0 "));
		assertEquals(g1.getScoresSize(), 2, 0);
		assertEquals(g2.getScoresSize(), 2, 0);
		
	}

	@Test
	public void testSum() {
		
		assertEquals(g1.sum(), 55, 0);
		assertEquals(g2.sum(), 43.5, 0);
		
	}

	@Test
	public void testMinimum() {

		assertEquals(g1.minimum(), 15, 0);
		assertEquals(g2.minimum(), 10.5, 0);
		
	}

	@Test
	public void testFinalScore() {

		assertEquals(g1.finalScore(), 40, 0);
		assertEquals(g2.finalScore(), 33, 0);
		
	}

	@Test
	public void testGetScoreSize() {
		
		assertEquals(g1.getScoresSize(), 2, 0);
		assertEquals(g2.getScoresSize(), 2, 0);
		
	}

}
