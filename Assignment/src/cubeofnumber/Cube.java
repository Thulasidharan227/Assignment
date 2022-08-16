package cubeofnumber;
import java.util.Scanner;
public class Cube {
public static void main(String args[]) {
	int cubeValue;
	try(Scanner s= new Scanner(System.in)){
	int  num = s.nextInt();
	cubeValue= num*num*num;
	System.out.printf("The cube of " +num+" is "+cubeValue);
}
}
}