package fr.dauphine.javavance.td5;

import java.util.Comparator;

public class MarqueSorter implements Comparator<Object> {
	
	
	public int compare(Object o1, Object o2) {
		String m1 = "";
		String m2 = "";

		if (o1 instanceof Car) { 
			Car c1 = (Car) o1;
			m1 = c1.getBrand();
		}
		if (o1 instanceof Bike) { 
			Bike b1 = (Bike) o1;
			m1 = b1.getMarque();
		}
		
		if (o2 instanceof Car) { 
			Car c2 = (Car) o2;
			m2 = c2.getBrand();
		}
		if (o2 instanceof Bike) { 
			Bike b2 = (Bike) o2;
			m2 = b2.getMarque();
		}
		
		return m1.compareTo(m2);	
	}

}
