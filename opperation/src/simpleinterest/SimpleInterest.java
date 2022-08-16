package simpleinterest;
import variable.Variable;
import java.lang.Thread;
public class SimpleInterest {
	public void simpIntrst()  {
		String g = " ";
		Variable v= new Variable();
		v.setA(10000);
		v.setB(20);
		v.setC(25);
		int d=(v.getA()*v.getB()*v.getC())/100;
		String.valueOf(false);
		System.out.println("10. Estimated interest amount is "+d);
		for(int i = 1;i<11;i++) {
			g+=" ";
		try {Thread.sleep(500);}catch(Exception e) {}
		System.out.println(g+i);
		}
		try {Thread.sleep(500);}catch(Exception e) {}
		System.out.print("over");
	}

}
