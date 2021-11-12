package fr.dauphine.javavance.td5;

import static org.junit.Assert.*;

import org.junit.Test;

public class BikeTest {

	@Test
	public void bikeequalsTest() {
		Bike b1 = new Bike();
		Bike b2 = new Bike("Ridley");
		assertEquals(false, b1.equals(b2));
	}

}
