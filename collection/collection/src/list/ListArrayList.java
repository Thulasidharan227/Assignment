package list;
import java.util.ArrayList;
import java.util.Collections;
	public class ListArrayList{
		public static void main(String[] args) {
			ArrayList<Integer> al = new ArrayList<>();
			al.add(45);
			al.add(25);
			al.add(2);
			al.add(11);
			al.add(30);
			al.add(18);
			System.out.println(al.get(5));
			System.out.println(al);
			Collections.rotate(al, 3);
			System.out.println(al);
			Collections.sort(al);
			System.out.println(al);
			Collections.reverse(al);
			System.out.println(al);
			System.out.println(Collections.max(al));
			System.out.println(Collections.min(al));
			System.out.println(al.indexOf(11));
			
			for(int values : al) {
				System.out.println(values);
			}
			System.out.println(al);
		}

	}
