package map;

import java.util.ArrayList;
import java.util.HashMap;

public class MapHashMap {
	public static void main(String [] args) {

	ArrayList<Student> alDev= new ArrayList<>();
	
	alDev.add(new Student(21,"Thulasi","Cricket"));
	alDev.add(new Student(22,"Bala","supplier"));
	
	alDev.add(new Student(35,"Anandh","coding"));
	//alDev.add(new Student(22,"Lokesh","padikradhu"));
	
	ArrayList<Student> alDevops= new ArrayList<>();
	
	alDevops.add(new Student(148,"Gowtham","flirting"));
	alDevops.add(new Student(21,"Gowthami","rolling"));
	alDevops.add(new Student(35,"Shahil","alien behaviour"));
ArrayList<Student> alDevopsi= new ArrayList<>();
	
	alDevopsi.add(new Student(148,"Gowtham","flirting"));
	alDevopsi.add(new Student(21,"Gowthami","rolling"));
	alDevopsi.add(new Student(35,"Shahil","alien behaviour"));
	HashMap<String, ArrayList<Student> > hm= new HashMap<>();
	hm.put("Developer",alDev );
	hm.put("Devops", alDevops);
	hm.put("Devopsi", alDevopsi);
	HashMap<String, HashMap<String, ArrayList<Student>>> hmm = new HashMap<String, HashMap<String, ArrayList<Student>>>();
	hmm.put("employee", hm);
	HashMap<String, ArrayList<Student>> ss = hmm.get("employee");
		for( String df : ss.keySet()) {
			System.out.println(ss.get(df));
		}
	}
	
	

}