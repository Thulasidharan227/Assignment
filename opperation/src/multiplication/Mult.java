package multiplication;
import variable.Variable;
public class Mult {
	public int mult() {
		Variable v= new Variable();
		v.setA(6);
		v.setB(4);
		return v.getA()*v.getB();
	}
}
