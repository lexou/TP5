package fr.dauphine.javavance.td5;

public class Car extends Discount {
	private final String brand;
	private /*final*/ long value;
	private int vetuste;
	private boolean sale;
	
	//constructeurs
	public Car(String marque, long valeur) throws Exception {
		if (valeur < 0) { throw new IllegalArgumentException("La valeur doit être positive"); }
		brand = marque;
		value = valeur;
		sale = false;
	}
	
	public Car(String marque, long valeur, int vieillesse) throws Exception {
		if (valeur < 0 || vieillesse < 0) { throw new IllegalArgumentException("La valeur et l'age doivent être positifs"); }
		brand  = marque;
		vetuste = vieillesse;
		sale = false;
		long v = valeur-(vieillesse*1000);
		if (v < 0) { value = 0;}
		else { value = v; }
		
	}
	
	//Accesseurs
	public String getBrand() {
		return brand;
	}
	
	public long getValue() {
		return value;
	}
	
	
	
	public int getVetuste() {
		return vetuste;
	}
	
	public boolean getSale() {
		return sale;
	}
	
	public void setValue(long price) {
		this.value = price;
	}
	
	
	//Methodes
	public String toString() {
		return brand+": "+getValue();	
	}
	
	public boolean equals(Object c) {
		Car c1 = (Car) c;
		if ( this.brand.equals(c1.getBrand()) && this.value == c1.getValue() && this.vetuste == c1.getVetuste() ) {
			return true;
		}
		else { return false; }
	}
	
	public void applyDiscount(long nouveau) {
		if (sale) {
			this.setValue(nouveau);
		}
	}
	
	
	
}
