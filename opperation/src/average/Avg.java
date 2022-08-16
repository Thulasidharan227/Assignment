package average;
import variable.Variable;



public class Avg {
	public void avg() {
		
		Variable v= new Variable();
		v.setA(5);
		v.setB(15);
		
		int d =(v.getA()+v.getB())/2;
		System.out.println("5. Average of a and b is " +d);
		
	}
}
