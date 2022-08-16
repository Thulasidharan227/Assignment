package modulus;
import variable.Variable;
public class Mod {
	public int mod() {
		Variable v= new Variable();
		v.setA(6);
		v.setB(4);

		int c= v.getA()%v.getB();
		return c;
	}
}
