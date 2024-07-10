package Streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDup {
			 public static void main(String[] args) {
				 
		        String a = "Prakash";

		        Map<Character, Long> b = a.chars()
		                .mapToObj(c -> (char) c)
		                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		        b.entrySet().stream()
		                .filter(d -> d.getValue() > 1)
		                .forEach(e -> System.out.println("Character: " + e.getKey() + ", Count: " + e.getValue()));
		    }

}
