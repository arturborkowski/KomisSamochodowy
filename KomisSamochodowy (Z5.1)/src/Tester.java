import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class Tester {

	public static void main(String[] args) {
		
	//
		List<Car> cars = new ArrayList<Car>();
		CompareByPrice byPrice = new CompareByPrice();
		CompareByMark byMark = new CompareByMark();
		CompareByModel byModel = new CompareByModel();
		CompareByYear byYear = new CompareByYear();
		
		
	// tworzymy obiekty samochodów i dodajemy je do kolekcji
		cars.add(new Car("Syrena", "C-100", 1000, 1952));
		cars.add(new Car("Fiat", "Panda", 12000, 1999));
		cars.add(new Car("Aro", "Rumun", 4300, 1944));
		cars.add(new Car("Polonez", "Caro", 653, 1983));
		cars.add(new Car("Mercedes", "C", 100000, 2013));
		
		cars.get(0).compareTo(cars.get(1));
		byPrice.compare(cars.get(0), cars.get(1));
		
	// wyœwietlamy nieposortowane elementy listy
		System.out.println("\nNieposortowane:");
		for(Car x: cars) {
			System.out.println(x);
		}
		
	// wyœwietlamy elementy posortowane wg ceny
		byPrice.sortByPrice(cars);
		System.out.println("\nPosortowane (wg ceny):");
		for(Car x: cars) {
			System.out.println(x);
		}

	// wyœwietlamy elementy posortowane wg marki
		byMark.sortByMark(cars);
		System.out.println("\nPosortowane (wg marki):");

		for(Car x: cars) {
			System.out.println(x);
		}
		
	// wyœwietlamy elementy posortowane wg modelu
		byModel.sortByModel(cars);
		System.out.println("\nPosortowane (wg modelu):");

		for(Car x: cars) {
			System.out.println(x);
		}
		
	// wyœwietlamy elementy posortowane wg roku produkcji
		byYear.sortByYear(cars);
		System.out.println("\nPosortowane (wg roku produkcji):");

		for(Car x: cars) {
			System.out.println(x);
		}		
		
		
	
		
		
	}

}
