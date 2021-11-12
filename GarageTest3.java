package fr.dauphine.javavance.td5;

import static org.junit.Assert.*;

import org.junit.Test;

public class GarageTest3 {

	@Test
	public void proctectionismTest() throws Exception {
		Garage garage = new Garage();
		garage.add(new Car("Peugeot", 24800));
		garage.add(new Bike("Ridley"));
		garage.protectionism("Peugeot");
		assertEquals("Ridley: 100", garage.toString());
	}

}
