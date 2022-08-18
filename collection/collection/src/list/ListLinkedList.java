package list;

import java.util.LinkedList;

public class ListLinkedList {
		public static void main(String[] args) {
			LinkedList<Integer> lil = new LinkedList<>();
			lil.add(25);
			lil.add(2);
			lil.add(98);
			lil.add(25);
			lil.add(45);
			lil.add(1);
			lil.addFirst(4);
			lil.addLast(100);
			System.out.println(lil);
			System.out.println(lil.offerFirst(1));
			System.out.println(lil);
			System.out.println(lil.getFirst());
			System.out.println(lil.getLast());
			lil.addFirst(11);
			System.out.println(lil.peek());
			lil.push(9);
			System.out.println(lil);
			System.out.println(lil.poll());
			System.out.println(lil);
			System.out.println(lil.pollLast());
			System.out.println(lil);
		}

	}
