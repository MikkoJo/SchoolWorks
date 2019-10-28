package vko17;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@SuppressWarnings("unused")
public class LipunMyyntiTest {
	LipunMyynti testattava;
	
	@Mock
	private Varaus mockVaraus;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		testattava = new LipunMyynti();
	}

	@Test
	public void testVarausAsetettu() {
		when(mockVaraus.varaaLippuja(anyInt()))
			.thenReturn(new ArrayList<PaasyLippu>());
		testattava.asetaVaraus(mockVaraus);
		assertTrue(testattava.varausAsetettu());
	}


}
