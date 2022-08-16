package compoundinterest;

public class CompoundInterest {
	

			public static void  compoundInterest(int PrincipleAmout,double interestRate , int n,int timePeriod ){
				interestRate = interestRate/100;
				double C = 1+(interestRate/n);
				//n - number of times interest applied per time period
				double FinalAmount= (PrincipleAmout*Math.pow(C,(n*timePeriod)))-PrincipleAmout;
						
				System.out.println("Compound Interest = " +FinalAmount);
			}
			
			public static void main(String[] args) {
				compoundInterest(10000, 2, 5, 5);
			}
		}