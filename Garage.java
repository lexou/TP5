package fr.dauphine.javavance.td5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class Garage extends Discount{
	private ArrayList</*Car*/ Object> parc;
	private static int id;
	
	
	
	//Constructeur
	public Garage() {
		parc = new ArrayList<Object>();
	}
	
	//Getter
	public ArrayList<Object> getParc(){
		return parc;
	}	
	
	public int getId() {
		return id;
	}
	
	
	//Methodes	
	public void add(Object o) {
		parc.add(Objects.requireNonNull(o, "Le vehicule ne doit pas être null")); 
	}
	
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Object c : parc) {
			if (c instanceof Car) {
				Car elem = (Car) c;
				builder.append(elem.toString()).append("\n");
			}
			if (c instanceof Bike) {
				Bike elem = (Bike) c;
				builder.append(elem.toString()).append("\n");
			}
		}
		return builder.toString();
	}
	
	
	public long valeurParc() {
		long somme = 0;
		for (Object c : parc) {
			if (c instanceof Car) {
				Car elem = (Car) c;
				somme += elem.getValue();
			}
			if (c instanceof Bike) {
				Bike elem = (Bike) c;
				somme+= elem.getPrix();
			}
			
		}
		return somme;
	}
	
	public Car firstCarByBrand(String marque) {
		for (Object c : parc) {
			Car elem = (Car) c;
			if (elem.getBrand().equals(marque)){ return elem; }
		}
		return null;
	}
	
	public int indexOf(Object c) {
		int i = 0;
		for (Object elem : parc) {
			if (elem instanceof Car) { 
				Car c1 = (Car) elem; 
				if (c1.equals(c)) {
					return i;
				}
			}
			if (elem instanceof Bike ) { 
				Bike c1 = (Bike) elem; 
				if (c1.equals(c)) {
					return i;
				}	
			}
			i++;
		}
		return -1;
	}
	
	public boolean contains(Object o) {
		for (Object elem : parc) {
			if ( elem instanceof Car) { 
				Car c1 = (Car) elem;
				if (c1.equals(o)) { return true; }
			}
			if (elem instanceof Bike ) { 
				Bike c1 = (Bike) elem;
				if (c1.equals(o)) { return true; }
			}	
		}
		return false;
	}
	

	
	public void remove(Object o) {
		if (o instanceof Car) {
			Car c = (Car) o;
			//int occurrences = Collections.frequency(parc, c);
			//for (int i = 0; i < occurrences; i++) {
				parc.remove(c);
			//}
		}
		if (o instanceof Bike) {
			Bike c = (Bike) o;
			//int occurrences = Collections.frequency(parc, c);
			//for (int i = 0; i < occurrences; i++) {
				parc.remove(c);
			//}
		}
	}
	
	/*
	public void protectionism(String br) {
		List<Object> l = parc;
		Iterator<Object> it = l.iterator();	
		
		while ( it.hasNext() ) {
			System.out.println(it);

			if (it instanceof Car) {
				Car elem = (Car) it;
				if ( elem.getBrand().equals(br) ) { it.remove(); }
			}
			if (it instanceof Bike) {
				Bike elem = (Bike) it;
				if (elem.getMarque().equals(br)) { it.remove(); }
			}				
		}
	} // Probleme de boucle infinie */
	
	public void protectionism(String br) {
		ArrayList<Object> toGetRidOf = new ArrayList<Object>();
		for (Object elem : parc) {
			if (elem instanceof Car) {
				Car c = (Car) elem;
				//System.out.println(c);
				if (c.getBrand().equals(br)) { toGetRidOf.add(elem); }
			}
			if (elem instanceof Bike) {
				Bike b = (Bike) elem; 
				//System.out.println(b);
				if (b.getMarque().equals(br)) { toGetRidOf.add(elem); }
			}
		}
		parc.removeAll(toGetRidOf);
	}
	
	
	public boolean equals(Garage g) {
		if (this.parc.equals(g.getParc())) { return true; }
		else { return false; }
	}
	
	
	
}
