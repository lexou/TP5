package fr.dauphine.javavance.td5;

import static org.junit.Assert.* ;

import java.util.ArrayList;

import org.junit.Test;

public class GarageTest {
	
	@Test
	public void addCar() throws Exception {
		Garage garage = new Garage();
		Car c = new Car("Peugeot", 24800);
		garage.add(c);
		
		assertEquals(c.toString(), garage.toString());	
	}
	
	/*
	 @Test
	public void addNull() throws Exception {
		Garage garage = new Garage();
		assertNull(garage.add(null));
	}
	*/
	
	
	
	@Test
	public void firstCar() throws Exception {
		Garage garage = new Garage();
		garage.add(new Car("Peugeot", 24800));
		garage.add(new Car("Tesla", 35000));
		assertEquals("Peugeot: 24800", garage.firstCarByBrand("Peugeot").toString());	
	}
	
	
	@Test
	public void valeurParc() throws Exception{
		Garage garage = new Garage();
		garage.add(new Car("Peugeot", 24800));
		garage.add(new Car("Tesla", 35000));
		assertEquals(59800, garage.valeurParc());
	}
	

}
