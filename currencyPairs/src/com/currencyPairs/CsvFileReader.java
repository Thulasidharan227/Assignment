package com.currencyPairs;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CsvFileReader {
	public static void main(String[] args) throws IOException {
		String path ="C:\\Users\\THULASIDHARAN\\CurrencyPairs.csv";
		String line="";
		String[] values = null;
			ArrayList<CurrencyPair> al= new ArrayList<CurrencyPair>();
			BufferedReader buffererReader= new BufferedReader(new FileReader(path));
				while((line = buffererReader.readLine())!=null) {
					values = line.split(",");
					CurrencyPair currencyPair = new  CurrencyPair(values[0],values[1],values[2],values[3],values[4],values[5]);
					al.add(currencyPair);
				}
				
				
				//helps us to retrieve data by searching values of Currency1+currency2
				searching(al); 
				
				//helps us to sort the by currency1+currency2
				//sortion(al);
				//helps us to sort the last updated time
				/*sortDate(al);
				for(CurrencyPair cp :al) {
					System.out.println(cp);
				}*/
				
				}
	   private static void sortDate(ArrayList<CurrencyPair> al) {
		   Collections.sort(al, new DateSortion());
		
	}
	static CurrencyPair searching(ArrayList<CurrencyPair> al) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the  ccy pairs :");
		   String currencyPairs = sc.next();
		  
			for(CurrencyPair cp : al) {
				if(currencyPairs.equalsIgnoreCase(cp.getcurrency1()+cp.getcurrency2())) {
					System.out.println(cp);
				}
			}
			return null;
			
	  }
	   static void sortion(ArrayList<CurrencyPair> al) {
		   System.out.println("---------------------------------------------------------------------");
			Collections.sort(al);
			for(CurrencyPair o: al) {
			System.out.println(o);
		   
	   }
			
	   	  }
}
	   

