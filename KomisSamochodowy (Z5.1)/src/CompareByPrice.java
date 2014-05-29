import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

/*
 * W tej klasie, jak i jej podobnych, musimy zaimplementowaæ interfejs Comparator<T>, dziêki któremu mo¿emy dokonywaæ
 * porównania obiektów klas implementuj¹cych interfejs Comparable<T> za pomoc¹ metod, które jesteœmy zobligowani zaimplementowaæ.
 */
public class CompareByPrice implements Comparator<Car> {

	public CompareByPrice() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Car c1, Car c2) {
		if(c1.getPrice()>c2.getPrice()) return 1;
		if(c1.getPrice()<c2.getPrice()) return -1;
		else return 0;
	}
	
	
	public void sortByPrice(List<Car> list) {
		 /* W tym miejscu mo¿emy u¿yæ jednoargumentowej metody Collections.sort(), 
		 * poniewa¿ u¿ywa ona domyœlnie metody CompareTo(), która zosta³a zaimplementowana
		 * w klasie Car. W klasach podobnych do tej trzeba bêdzie u¿yæ metody korzystaj¹cej 
		 * z dwóch argumentów - kolekcji, oraz obiektu klasy, która implementuje interfejs
		 * Comparator
		 * 
		 */
		 Collections.sort(list);
	}
	
	

}
