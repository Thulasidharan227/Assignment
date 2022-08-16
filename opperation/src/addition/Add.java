package addition;
import variable.Variable;

public class Add {

	public int add() {
		Variable v= new Variable();
		v.setA(5);
		v.setB(5);
		return v.getA()+v.getB();
	}
}
