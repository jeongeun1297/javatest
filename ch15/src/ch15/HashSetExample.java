package ch15;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		int size = set.size();
		System.out.println(size);

	}

}
