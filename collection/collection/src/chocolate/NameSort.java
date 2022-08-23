package chocolate;
import java.util.Comparator;
public class NameSort implements Comparator<ChocolateSort> {

	@Override
	public int compare(ChocolateSort o1, ChocolateSort o2) {
		// TODO Auto-generated method stub
		return o1.chocoName.compareToIgnoreCase(o2.chocoName);
	}

}
