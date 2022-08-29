package com.currencyPairs;

public class CurrencyPair implements Comparable<CurrencyPair> {
	
	private String currency1;
	private String currency2;
	private String Spotdays;
	private String WeekendDays;
	private String Precision;
	private String LastUpdatedTime;
	public String curencyPair;


	public String getCurencyPair() {
		return curencyPair;
	}

	public void setCurencyPair(String curencyPair) {
		this.curencyPair = curencyPair;
	}

	public String getcurrency1() {
		return currency1;
	}

	public String getcurrency2() {
		return currency2;
	}

	public String getSpotdays() {
		return Spotdays;
	}

	public String getWeekendDays() {
		return WeekendDays;
	}

	public String getPrecision() {
		return Precision;
	}

	public String getLastUpdatedTime() {
		return LastUpdatedTime;
	}

	public CurrencyPair(String currency1, String currency2, String spotdays, String weekendDays, String precision,
			String lastUpdatedTime) {
		super();
		this.currency1 = currency1;
		this.currency2 = currency2;
		Spotdays = spotdays;
		WeekendDays = weekendDays;
		Precision = precision;
		LastUpdatedTime = lastUpdatedTime;
	}

	@Override
	public String toString() {
		return "CurrencyPair [currency1=" + currency1 + ", currency2=" + currency2 + ", Spotdays=" + Spotdays + ", WeekendDays="
				+ WeekendDays + ", Precision=" + Precision + ", LastUpdatedTime=" + LastUpdatedTime + "]";
	}

	@Override
	public int compareTo(CurrencyPair o) {
		
		return (currency1+currency2).compareTo(o.currency1+o.currency2);
	}
	

	


}
