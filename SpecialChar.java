package Streams;

import java.util.List;
import java.util.stream.Collectors;


public class SpecialChar {
	public static void main(String[] args) {
		String a ="Prakash@&91#$76";
				
List<Character> b = a.chars().filter(x->!Character.isLetterOrDigit(x) && !Character.isWhitespace(x))
    .mapToObj(x -> (char) x).collect(Collectors.toList());

b.forEach(y-> System.out.println(y));    
		
	}

}
