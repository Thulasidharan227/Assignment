package set;

import java.util.HashSet;

public class SetHashSet {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		HashSet<Integer> hse = new HashSet<>();
		hs.add(22);
		hs.add(62);
		hs.add(90);
		hs.add(87);
		hs.add(14);
		hs.add(71);
		hs.add(67);
		hs.add(87);
		hs.add(5);
		hs.add(40);
		System.out.println(hse);
		System.out.println("-----------------------");
		hse.add(22);
		hse.add(62);
		hse.add(90);
		hse.add(87);
		hse.add(14);
		hse.add(71);
		hse.add(67);
		hse.add(87);
		hse.add(5);
		hse.add(40);
		hse.add(2);
		System.out.println(hse);
		System.out.println(hs.size());
		System.out.println(hs.containsAll(hse));
	}

}