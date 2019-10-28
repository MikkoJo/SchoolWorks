package vko16;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OmaLuokkaTest {

	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void testGetFirstName() {
		OmaLuokka olio = new OmaLuokka();
		olio.setNimi("Jaska Jokunen");
		assertEquals("Jaska", olio.getFirstName(" "));
		olio.setNimi("Jaska.Jokunen");
		assertEquals("Jaska", olio.getFirstName("."));
		assertEquals("Jaska", olio.getFirstName("/"));
//		fail("Not yet implemented");
		
	}
//
//	@Test
//	public void testGetNimi() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	@Test
//	public void testSetNimi() {
//		fail("Not yet implemented"); // TODO
//	}

}
