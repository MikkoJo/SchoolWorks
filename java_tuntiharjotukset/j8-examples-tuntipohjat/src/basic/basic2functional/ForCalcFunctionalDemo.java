package basic.basic2functional;

import java.util.stream.IntStream;

public class ForCalcFunctionalDemo {

    public static int sum(int begin, int end) {
//        int sum = 0;
//        for (int i = begin; i <= end; i++) {
//            sum += i;
//        }
//        return IntStream.rangeClosed(begin, end).reduce(0, Integer::sum);
        return IntStream.rangeClosed(begin, end).sum();
    }

    public static int multiply(int begin, int end) {
//        int multiply = 1;
//        int i = begin;
//
//        while (i <= end) {
//            multiply *= i;
//            i++;
//        }
//        return multiply;
    	return IntStream.rangeClosed(begin, end).reduce(1, (x, y) -> x * y); 
//    	return IntStream.rangeClosed(begin, end).reduce((x, y) -> x * y).getAsInt(); 
    }

    public static void main(String args[]) {

        int sum = sum(1, 10);
        int res = multiply(1, 10);

        System.out.println("sum 1-10 = " + sum);
        System.out.println("multiply 1-10 = " + res);

    }
}
