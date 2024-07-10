package Streams;

import java.util.stream.Stream;

public class Fibonacci {
	public static void main(String[] args) {
		
		 Stream.iterate(new long[]{0, 5}, f -> new long[]{f[1], f[0] + f[1]})
         .limit(10) .map(n -> n[0]).forEach(System.out::println);
	}

}
