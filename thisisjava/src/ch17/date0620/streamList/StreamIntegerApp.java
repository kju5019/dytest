package ch17.date0620.streamList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntegerApp {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println("===== Stream =====");
		Stream<Integer> stream = list.stream();
		stream.forEach(a -> System.out.print(a + " "));


	}

}
