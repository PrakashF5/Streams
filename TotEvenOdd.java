package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TotEvenOdd {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(2, 6, 7, 4, 5, 9, 2);

        int addEven = nums.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
                          
        int addOdd = nums.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
                         
        System.out.println("Total of even numbers: " + addEven);
        System.out.println("Total of odd numbers: " + addOdd);
	
System.out.println("-------------------------------------------");
		
		int[] a = {2, 6, 7, 4, 5, 9, 2};
		
		List<Integer> b = Arrays.stream(a).boxed().collect(Collectors.toList());

        int sumEven = b.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
                          
        int sumOdd = b.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
                         
        System.out.println("Total of even numbers: " + sumEven);
        System.out.println("Total of odd numbers: " + sumOdd);
		
	}

}
