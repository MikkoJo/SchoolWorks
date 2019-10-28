package harjoitukset;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.Before;
import org.junit.Test;

public class AtomicTest {
	
	Map<String, Double> map;

	@Before
	public void setUp() throws Exception {
		map = new LinkedHashMap<>();
		map.put("first", 1.0);
		map.put("second", 15.0);
		map.put("third", 14.0);
	}

	@Test
	public void test() {
		AtomicReference<Double> atomicSum = new AtomicReference<>(0.0);
		AtomicReference<Double> atomicMulti = new AtomicReference<>(1.0);
		
		map.values().forEach(d -> atomicSum.set(atomicSum.get() + d));
		System.out.println(atomicSum);

		map.values().forEach(d -> atomicMulti.set(atomicMulti.get() * d));
		System.out.println(atomicMulti);
	}

}
