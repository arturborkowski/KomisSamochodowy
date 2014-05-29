import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

/*
 * W tej klasie, jak i jej podobnych, musimy zaimplementowa� interfejs Comparator<T>, dzi�ki kt�remu mo�emy dokonywa�
 * por�wnania obiekt�w klas implementuj�cych interfejs Comparable<T> za pomoc� metod, kt�re jeste�my zobligowani zaimplementowa�.
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
		 /* W tym miejscu mo�emy u�y� jednoargumentowej metody Collections.sort(), 
		 * poniewa� u�ywa ona domy�lnie metody CompareTo(), kt�ra zosta�a zaimplementowana
		 * w klasie Car. W klasach podobnych do tej trzeba b�dzie u�y� metody korzystaj�cej 
		 * z dw�ch argument�w - kolekcji, oraz obiektu klasy, kt�ra implementuje interfejs
		 * Comparator
		 * 
		 */
		 Collections.sort(list);
	}
	
	

}
