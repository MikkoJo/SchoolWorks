package basic.functional;

import java.util.stream.IntStream;

public class CalculateFunctionsFunctionalDemo {

    // static final variables to define LOWER and UPPER limits
    static final int LOWER = 1, UPPER = 12;

    public static void main(String argv[]) {
//        int i = 0, k = 0;
//        for (i = LOWER; i <= UPPER; i++) {
//            int tmp = 0;
//            for (k = LOWER; k <= UPPER; k++) {
//                tmp = k * i;
//                System.out.print(tmp + "\t");
//            }
//            System.out.println();
//        }
        IntStream.rangeClosed(LOWER,  UPPER).forEach(a -> { 
        	IntStream.rangeClosed(LOWER,  UPPER)
        	.forEach(b -> System.out.print(a * b + "\t"));
        	System.out.println();
        	});

    }
}
