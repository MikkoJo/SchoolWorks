package harjoitukset;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class DoubleListStatisticsTest {

	 

    List<Double> values;
    private static final double DELTA = 1e-15; // the maximum delta between expected and actual for which both values are still considered equal.

    @Before
    public void setUp() {

      values = Arrays.asList(4.8,7.0,9.1,10.9,13.0,15.0,17.0,19.2);
      // HUOM! values nyt suoraan käytettävissä kaikissa testimetodeissa

    }

	@Test
    public void avgIterative() {
    	double sum = 0.0;
    	for(double d: values) sum += d;

    	double avg = sum / values.size();
    	assertEquals(12.0, avg, DELTA);


    }

	@Test
    public void avgIterative2() {
    	double sum2 = 0.0;
    	for(int i = 0; i < values.size(); i++) sum2 += values.get(i);

    	double avg2 = sum2 / values.size();
    	assertEquals(12.0, avg2, DELTA);

    }
 

    @Test
    public void avgWithLambdas() {

	    double avg = values.stream().mapToDouble((d) -> d).average().getAsDouble();
	 	assertEquals(12.0, avg, DELTA);

    }

    @Test
    public void avgWithLambdas2() {

	    double avg = values.stream().reduce(0.0, (a,b) -> a+b) / values.size();
	 	assertEquals(12.0, avg, DELTA);

    }

    @Test
    public void avgWithDoubleSummary() {

    	DoubleSummaryStatistics stats = values.stream()
    			.collect(Collectors.summarizingDouble(Double::doubleValue));
    	double avg = stats.getAverage();
	 	assertEquals(12.0, avg, DELTA);

    }

    @Test
    public void combineStats() {

    	DoubleSummaryStatistics stats = values.stream()
    			.collect(Collectors.summarizingDouble(Double::doubleValue));
    	DoubleSummaryStatistics stats2 = values.stream().filter(i -> i > 10 && i <15)
    			.mapToDouble(i -> i).summaryStatistics();
    	System.out.println(stats);
    	System.out.println(stats2);
    	stats.combine(stats2);
    	System.out.println(stats);
    	
    	double avg = stats.getAverage();
	 	assertEquals(12.0, avg, DELTA);

    }

}
