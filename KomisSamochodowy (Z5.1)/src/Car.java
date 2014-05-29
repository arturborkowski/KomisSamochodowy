	


/*
 * Musimy tutaj zaimplemetnowa� interfejs Comparable<T>, �eby inne klasy zaopatrzone w interfejs
 * Comparator wiedzia�y w jaki spos�b por�wna� obiekty. Interfejs Comparable<T> obliguje nas do
 * zaimplementowania metody compareTo(), kt�ra definiuje spos�b por�wnywania obiekt�w. Pozwala on r�wnie�
 * na u�ywanie szeregu metod z klasy Collections, kt�re wymaga�yby por�wnywania obiekt�w (jak na przyk�ad Collections.sort)
 *
 */
public class Car implements Comparable<Car> {

	private String mark;
	private int price;
	private String model;
	private int year;
	

	//******** KONSTRUKTORY ***********//

	public Car() {
		mark = "";
		price = 0;
		model = "";
		year = 0;
	}
	
	public Car(String mark, String model, int price, int year) {
		this.mark = mark;
		this.price = price;
		this.model = model;
		this.year = year;
	}
	
	

	//***************** GETTERY I SETTERY *************//
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	public String getMark() {
		return this.mark;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	//************** NADPISANA METODA compareTo() *************//
	@Override
	public int compareTo(Car o) {
		if(price<o.getPrice()) return -1;
		if(price>o.getPrice()) return 1;
		if(price==o.getPrice()) return 0;
		return 0;
	}
	
	
	// ************ toString() *********** //
	@Override
	public String toString() {
		return mark+" "+model+", rok produkcji: "+year+", cena: "+price;
	}
	
	
}