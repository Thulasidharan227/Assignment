package main;
import addition.Add;
import division.Div;
import average.Avg;
import multiplication.Mult;
import perimetersquare.PerimeterSquare;
import perimetrrectangle.PerimeterRectangle;
import simpleinterest.SimpleInterest;
import square.Sqr;
import subtraction.Sub;
import modulus.Mod;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Add a= new Add();
		System.out.println(a.add());
		Sub su= new Sub();
		System.out.println(su.sub());;
		Div d= new Div();
		System.out.println(d.div());
		Avg av=new Avg();
		av.avg();
		Mult m=new Mult();
		System.out.println(m.mult());;
		PerimeterSquare ps= new PerimeterSquare();
		ps.perimetrOfSqr();
		PerimeterRectangle pr= new PerimeterRectangle();
		pr.perimetrOfRec();
		Sqr s= new Sqr();
		s.sqr();
		Mod md= new Mod();
		md.mod();
		SimpleInterest i=new SimpleInterest();
		i.simpIntrst();
	}

}
