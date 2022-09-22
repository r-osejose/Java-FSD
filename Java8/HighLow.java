package Java8;

import java.util.Comparator;
import java.util.stream.*;

public class HighLow {
	public static void main(String[] args) {
		Integer Highest = Stream.of(0,12,6,200).max(Comparator.comparing(Integer::valueOf)).get();
		Integer Lowest = Stream.of(1,12,6,100).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("The highest number is: "+Highest);
		System.out.println("The lowest number is: "+Lowest);


	}

}
