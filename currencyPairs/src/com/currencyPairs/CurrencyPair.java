package com.currencyPairs;

public class CurrencyPair implements Comparable<CurrencyPair> {
	
	private String Ccy1;
	private String Ccy2;
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

	public String getCcy1() {
		return Ccy1;
	}

	public String getCcy2() {
		return Ccy2;
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

	public CurrencyPair(String ccy1, String ccy2, String spotdays, String weekendDays, String precision,
			String lastUpdatedTime) {
		super();
		Ccy1 = ccy1;
		Ccy2 = ccy2;
		Spotdays = spotdays;
		WeekendDays = weekendDays;
		Precision = precision;
		LastUpdatedTime = lastUpdatedTime;
	}

	@Override
	public String toString() {
		return "CurrencyPair [Ccy1=" + Ccy1 + ", Ccy2=" + Ccy2 + ", Spotdays=" + Spotdays + ", WeekendDays="
				+ WeekendDays + ", Precision=" + Precision + ", LastUpdatedTime=" + LastUpdatedTime + "]";
	}

	@Override
	public int compareTo(CurrencyPair o) {
		
		return (Ccy1+Ccy2).compareTo(o.Ccy1+o.Ccy2);
	}
	

	


}
