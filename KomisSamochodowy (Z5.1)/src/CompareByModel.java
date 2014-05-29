import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CompareByModel implements Comparator<Car>{

	public CompareByModel() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Car c1, Car c2) {
		
		return c1.getModel().compareToIgnoreCase(c2.getModel());
	}
	
	public void sortByModel(List<Car> list) {
		Collections.sort(list, new CompareByModel());
	}

}
