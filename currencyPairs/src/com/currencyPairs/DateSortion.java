package com.currencyPairs;

import java.util.Comparator;

public class DateSortion implements Comparator<CurrencyPair> {


	@Override
	public int compare(CurrencyPair o1, CurrencyPair o2) {
		
		return o1.getLastUpdatedTime().compareTo(o2.getLastUpdatedTime());
	}

}
