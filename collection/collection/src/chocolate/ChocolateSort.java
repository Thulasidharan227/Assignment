package chocolate;
//Using comparable ;-)
public class ChocolateSort implements Comparable<ChocolateSort> {
	int chocoNum;
	public String chocoName;
	int price;
	String flavour;
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	@Override
	public String toString() {
		return "[chocoNum=" + chocoNum + ", chocoName=" + chocoName + ", price=" + price + ", flavour="
				+ flavour + "]";
	}
	public int getChocoNum() {
		return chocoNum;
	}
	public void setChocoNum(int chocoNum) {
		this.chocoNum = chocoNum;
	}
	public String getChocoName() {
		return chocoName;
	} 
	public void setChocoName(String chocoName) {
		this.chocoName = chocoName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public ChocolateSort(int chocoNum, String chocoName, int price,String flavour) {
		super();
		this.chocoNum = chocoNum;
		this.chocoName = chocoName;
		this.price = price;
		this.flavour=flavour;
	}
	@Override
	public int compareTo(ChocolateSort o) {
		// TODO Auto-generated method stub
		return price-o.price;
	}
	
	
	

}
