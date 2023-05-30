package ch15.sec03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("JSP");
		set.add("JAVA");
		set.add("Spring");
		
		int size = set.size();
		System.out.println("총 객체 수: " +size);
		System.out.println("--------");
		
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			String str = itor.next();
			System.out.println(str);
		}
		
		System.out.println("--------");
		for (String str : set) {
			System.out.println(str);
		}

	}

}
