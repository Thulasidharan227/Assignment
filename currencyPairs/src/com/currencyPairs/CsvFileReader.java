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
			BufferedReader br= new BufferedReader(new FileReader(path));
				while((line = br.readLine())!=null) {
					values = line.split(",");
					CurrencyPair c = new  CurrencyPair(values[0],values[1],values[2],values[3],values[4],values[5]);
					al.add(c);
				}
				/*sortDate(al);
				for(CurrencyPair cp :al) {
					System.out.println(cp);
				}*/
				searching(al); 
				
				//sortion(al);
				
				//dateSortion(al);
				}
	   private static void sortDate(ArrayList<CurrencyPair> al) {
		   Collections.sort(al, new DateSortion());
		
	}
	static CurrencyPair searching(ArrayList<CurrencyPair> al) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the  ccy pairs :");
		   String ccyPairs = sc.next();
		  
			for(CurrencyPair cp : al) {
				if(ccyPairs.equalsIgnoreCase(cp.getCcy1()+cp.getCcy2())) {
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
	   static void dateSortion(ArrayList<CurrencyPair> al) {
		   
		   Collections.sort(al);
		   for(CurrencyPair v : al) {
			   System.out.println(v);
		   }
		   
		  }
}
	   

