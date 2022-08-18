package list;

import java.util.Collections;
import java.util.Vector;

public class ListVector {
	
	public static void main(String[] args) {
		Vector<String> vr = new Vector<>();
		vr.add("Thulasi");
		vr.add("dharan");
		vr.add("chandru");
		vr.add("bt");
		vr.add("finzly");
		Collections.sort(vr);
		System.out.println(Collections.max(vr));
		System.out.println(vr);
		System.out.println(vr.get(3));
		vr.setSize(5);
		System.out.println(vr.size());
		System.out.println(vr.capacity());
		System.out.println(vr);
		vr.insertElementAt("M", 0);
		System.out.println(vr);
		System.out.println(vr.indexOf("Thulasi"));
		for(String values : vr) {
			System.out.println(values);
		}
		vr.clear();
		System.out.println(vr);
		System.out.println(vr.isEmpty());
	}
	
	
	
	
}
