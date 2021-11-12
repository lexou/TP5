package fr.dauphine.javavance.td5;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {
	
	@Test(expected = IllegalArgumentException.class)
	public void CarConstructor1() throws Exception {
		Car c = new Car("Tesla", -1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void CarConstructor2() throws Exception {
		Car c = new Car("Tesla", 35000, -1);
	}
	
	 
 
}
