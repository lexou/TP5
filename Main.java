package fr.dauphine.javavance.td5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[ ] args) throws Exception {

	Car a = new Car("Audi", 10000); 
	Car b = new Car("BMW", 9000); 
	Car c = new Car("BMW", 9000); 
	Car d = a ;
	Bike b1 = new Bike("Ridley");
	Bike b2 = new Bike("Decathlon");
	Bike b3 = new Bike("Decathlon");
	Bike b4 = new Bike();
	
	
	
	//System.out.println( a==b );
	//System.out.println( b==c );  
	//System.out.println( a==d ); 
	/*System.out.println( a.equals(b) ); 
	System.out.println( b.equals(c) ); 
	System.out.println( a.equals(d) );  */  

	
	
	Garage garage = new Garage();
	garage.add(a);
	garage.add(b);
	//ArrayList<Object> list = garage.getParc(); 
	/*
	System.out.println(garage.indexOf(a)); 
	System.out.println(garage.indexOf(b)); 
	System.out.println(garage.indexOf(c)); */
	//System.out.println(b.equals(c));
	
	
	//garage.remove(a);
	//System.out.println(garage);  
	
	
	/*HashSet<Car> set = new HashSet<Car>(); 
	garage.add(b); 
	System.out.println(garage.contains(c)); */
	
	garage.add(c);
	garage.add(b1);
	garage.add(b2);
	garage.add(b3);
	//garage.add(b4);
	//System.out.println(garage);
	//garage.protectionism("BMW");	
	//System.out.println(garage);
	//garage.protectionism("Decathlon");
	//System.out.println(garage);
	
	Garage garage2 = new Garage();
	garage2.add(b);
	Collections.sort(garage2.getParc(), new MarqueSorter());

	garage2.add(a);
	Collections.sort(garage2.getParc(), new MarqueSorter());

	garage2.add(c);
	Collections.sort(garage2.getParc(), new MarqueSorter());

	garage2.add(b1);
	Collections.sort(garage2.getParc(), new MarqueSorter());

	garage2.add(b2);
	Collections.sort(garage2.getParc(), new MarqueSorter());

	garage2.add(b3);
	Collections.sort(garage2.getParc(), new MarqueSorter());

	//System.out.println(garage.equals(garage2));
	
	System.out.println(garage2);
	
	}
	

	
	
}
	
