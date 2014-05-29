import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CompareByMark implements Comparator<Car>{

	public CompareByMark() {
		// TODO Auto-generated constructor stub
	}

	@Override		
	public int compare(Car c1, Car c2) {
		return c1.getMark().compareToIgnoreCase(c2.getMark());
	}
	
	public void sortByMark(List<Car> list) {
		Collections.sort(list, new CompareByMark());
	}
	

}
