package ch17.date0620.streamList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamStringApp {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Paige");
		list.add("James");
		list.add("Smith");
		list.add("Tom");
		list.add("Victoria");

		System.out.println("===== Stream =====");
		Stream<String> stream = list.stream();
		stream.forEach(s -> System.out.print(s + " "));

	}

}
