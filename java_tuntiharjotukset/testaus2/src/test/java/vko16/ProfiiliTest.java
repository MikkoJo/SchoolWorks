package vko16;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ProfiiliTest {

	Profiili prof;
	@Before
	public void setUp() throws Exception {
		 prof = new Profiili();
		 prof.setStatus("Rikki");
	}

	@Test
	public void testGetStatus() {
		assertEquals("Rikki", prof.getStatus());
		prof.setStatus("Korjattu");
		assertEquals("Korjattu", prof.getStatus());
		
	}

	@Ignore
	@Test
	public void testGetAlennusProsentti() {
		fail("Not yet implemented"); // TODO
	}

}
