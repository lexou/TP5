package fr.dauphine.javavance.td5;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest2 {

	@Test
	public void equalTest() throws Exception {
		Car c = new Car("Tesla", 35000);
		Car c2 = new Car("Tesla", 35000);
		assertEquals(true, c.equals(c2));
	}
	
	
	
	

}
