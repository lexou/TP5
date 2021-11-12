package fr.dauphine.javavance.td5;

import static org.junit.Assert.*;

import org.junit.Test;

public class GarageTest2 {

	@Test
	public void indexOfTest() throws Exception {
		Garage garage = new Garage();
		Car c1 = new Car("Peugeot", 24800);
		Car c2 = new Car("Tesla", 35000);
		Car c3 = new Car("Peugeot", 24800);
		garage.add(c1);
		garage.add(c2);
		assertEquals(0, garage.indexOf(c3));

	}
	
	@Test
	public void valeurParcTest2() throws Exception{
		Garage garage = new Garage();
		garage.add(new Car("Peugeot", 24800));
		garage.add(new Bike("Ridley"));
		assertEquals(24900, garage.valeurParc());
	}
	

	@Test
	public void removeTest() throws Exception {
		Garage garage = new Garage();
		Car c1 = new Car("Peugeot", 24800);
		Car c2 = new Car("Tesla", 35000);
		garage.add(c1);
		garage.add(c2);
		garage.remove(c2);
		assertEquals("Peugeot: 24800", garage.toString());
		
	}
	
	@Test
	public void containsTest() throws Exception {
		Garage garage = new Garage();
		Car c = new Car("Peugeot", 24800);
		garage.add(c);
		garage.add(new Bike("Ridley"));
		assertEquals(true, garage.contains(c));
	}
	

}
