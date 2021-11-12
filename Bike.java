package fr.dauphine.javavance.td5;

public class Bike extends Discount{
	private String marque;
	private /*final*/ long prix;
	private boolean sale;
	
	
	//Constructeur
	public Bike() {
		marque = "";
		prix = 100;
		sale = false;
	}
	
	public Bike(String str) {
		marque = str;
		prix = 100;
		sale = false;
	}
	
	//Setter
	public void setPrix(long pr) {
		this.prix = pr;
	}
	
	public void setSale(boolean val) {
		this.sale = val;
	}
	
	
	
	//Accesseurs
	public String getMarque() {
		return marque;
	}
	
	public long getPrix() {
		return prix;
	}
	
	public boolean getSale() {
		return sale;
	}
	
	
	
	//Methodes
	public String toString() {
		return marque+": "+getPrix();
	}
	
	
	public boolean equals(Object b) {
		Bike b1 = (Bike) b;
		if ( this.marque.equals(b1.getMarque()) && this.sale == b1.getSale() ) {
			return true;
		}
		else { return false; }
	}
	
	
	public void applyDiscount(long nouveau) {
		if (sale) {
			this.setPrix(nouveau);
		}
	}
	
	
}
