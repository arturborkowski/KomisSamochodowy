import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CompareByYear implements Comparator<Car> {

	public CompareByYear() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Car c1, Car c2) {
		if(c1.getYear()>c2.getYear()) return 1;
		if(c1.getYear()<c2.getYear()) return -1;
		else return 0;
	} 
	
	public void sortByYear(List<Car> list) {
		Collections.sort(list, new CompareByYear());
	}
}

