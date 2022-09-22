package Java8;

import java.util.ArrayList;
import java.util.List;

public class Sum {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(50);
        int sum=list.stream().mapToInt(i->i.intValue()).sum();
        System.out.println("Sum of numbers: "+sum);
    }
}
