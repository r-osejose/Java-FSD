package Java8;

import java.util.Random;

public class SortedOrder {

	public static void main(String[] args) {
		Random random = new Random();
        random.ints().limit(5).sorted().forEach(System.out::println);
	}

}
