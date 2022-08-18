package set;

import java.util.LinkedHashSet;

public class SetLinkedHashSet {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lh =new LinkedHashSet<>();
		LinkedHashSet<Integer> hse =new LinkedHashSet<>();
		lh.add(15);
		lh.add(89);
		lh.add(15);
		lh.add(35);
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
		System.out.println(lh);
		System.out.println(lh+""+hse);
	}

}