package ch17.date0620.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		System.out.println("===== Java =====");
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Paige", 20));
		list.add(new Person("James", 30));
		list.add(new Person("Smith", 40));
		list.add(new Person("Tom", 50));
		list.add(new Person("Victoria", 60));

		System.out.println("\n===== Stream.filter() =====");

		System.out.println("\n----- 1. -----");
		// 이름이 "James"
		list.stream().filter(item -> item.getName().equals("James"))
					.forEach(item -> item.printInfo());

		System.out.println("\n----- 2. -----");
		// 30세 이상
		list.stream().filter(item -> item.getAge()>=30)
					.forEach(item -> item.printInfo());

		System.out.println("\n----- 3. -----");
		// 60세 미만이고, 이름에 "a" 포함
		list.stream().filter(item -> item.getAge()<60)
					.filter(item -> item.getName().contains("a"))
					.forEach(item -> item.printInfo());

	}

}
