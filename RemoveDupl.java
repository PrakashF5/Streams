package Streams;

import java.util.Arrays;


public class RemoveDupl {
	public static void main(String[] args) {		
	
	int[] a = {1, 2, 2, 8, 4, 4, 38};

   int[] b = Arrays.stream(a).distinct().toArray();
   
    Arrays.stream(b).forEach(c -> System.out.println(c));

	}
}
