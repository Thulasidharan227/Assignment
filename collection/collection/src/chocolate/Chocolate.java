package chocolate;
import java.util.ArrayList;
import java.util.Collections;
public class Chocolate {
public static void main(String[] args) {
	ArrayList<ChocolateSort> al= new ArrayList<>();
	al.add(new ChocolateSort(1,"Dairy Silk",65,"bubbly"));
	al.add(new ChocolateSort(2,"Five star",50,"nuts"));
	al.add(new ChocolateSort(3,"Almond Dairy",1115,"crackers"));
	al.add(new ChocolateSort(4,"Snickers",110,"vanila"));
	al.add(new ChocolateSort(5,"Kit Kat",45,"oreo"));
	Collections.sort(al);
	
	System.out.println("sort by flavour using comparable ");
	System.out.println();
	
	for(ChocolateSort t: al) {
		System.out.println(t);
	}
	System.out.println("__________________________________________________________________________");
	
	System.out.println("sort by name using comparator");
	
	System.out.println("");
	Collections.sort(al,new NameSort());
	for(ChocolateSort o : al) {
		System.out.println(o);
	}
}
}
