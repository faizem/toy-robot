package test.com.toyrobot;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.toyrobot.ToyRobotPlace;
import com.toyrobot.ToyRobotSimulation;


public class ToyRobotSimulationTest {

	@Test
	public void testToyRobotActionPositioning() {
		
		ToyRobotPlace toyRobotPlace = new ToyRobotPlace();
		toyRobotPlace.setAction("PLACE");
		toyRobotPlace.setxAxis("0");
		toyRobotPlace.setyAxis("0");
		toyRobotPlace.setFace("NORTH");
		
		ToyRobotSimulation toyRobotSimulation = new ToyRobotSimulation();
		toyRobotSimulation.toyRobotAction(toyRobotPlace);
		
		assertEquals(toyRobotPlace.getReport(), "0:0:NORTH");
	}
	
	@Test
	public void testToyRobotActionLeft() {
		
		ToyRobotPlace toyRobotPlace = new ToyRobotPlace();
		toyRobotPlace.setAction("PLACE");
		toyRobotPlace.setxAxis("0");
		toyRobotPlace.setyAxis("0");
		toyRobotPlace.setFace("NORTH");
		toyRobotPlace.setAction("LEFT");
		
		ToyRobotSimulation toyRobotSimulation = new ToyRobotSimulation();
		toyRobotSimulation.toyRobotAction(toyRobotPlace);
		
		assertEquals(toyRobotPlace.getReport(), "0:0:WEST");
	}
	
	@Test
	public void testToyRobotActionRight() {
		
		ToyRobotPlace toyRobotPlace = new ToyRobotPlace();
		toyRobotPlace.setAction("PLACE");
		toyRobotPlace.setxAxis("0");
		toyRobotPlace.setyAxis("0");
		toyRobotPlace.setFace("NORTH");
		toyRobotPlace.setAction("RIGHT");
		
		ToyRobotSimulation toyRobotSimulation = new ToyRobotSimulation();
		toyRobotSimulation.toyRobotAction(toyRobotPlace);
		
		assertEquals(toyRobotPlace.getReport(), "0:0:EAST");
	}
	
	@Test
	public void testToyRobotActionMove() {
		
		ToyRobotPlace toyRobotPlace = new ToyRobotPlace();
		toyRobotPlace.setAction("PLACE");
		toyRobotPlace.setxAxis("0");
		toyRobotPlace.setyAxis("0");
		toyRobotPlace.setFace("NORTH");
		toyRobotPlace.setAction("MOVE");
		
		ToyRobotSimulation toyRobotSimulation = new ToyRobotSimulation();
		toyRobotSimulation.toyRobotAction(toyRobotPlace);
		
		assertEquals(toyRobotPlace.getReport(), "0:1:NORTH");
	}
	
	@Test
	public void testToyRobotActionTwoLeft() {
		
		ToyRobotPlace toyRobotPlace = new ToyRobotPlace();
		toyRobotPlace.setAction("PLACE");
		toyRobotPlace.setxAxis("0");
		toyRobotPlace.setyAxis("0");
		toyRobotPlace.setFace("NORTH");
		toyRobotPlace.setAction("LEFT");
				
		ToyRobotSimulation toyRobotSimulation = new ToyRobotSimulation();
		toyRobotSimulation.toyRobotAction(toyRobotPlace);
		toyRobotPlace.setAction("LEFT");
		toyRobotSimulation.toyRobotAction(toyRobotPlace);
		assertEquals(toyRobotPlace.getReport(), "0:0:SOUTH");
	}
	
	@Test
	public void testToyRobotOutsideGrid() {
		
		ToyRobotPlace toyRobotPlace = new ToyRobotPlace();
		toyRobotPlace.setAction("PLACE");
		toyRobotPlace.setxAxis("0");
		toyRobotPlace.setyAxis("0");
		toyRobotPlace.setFace("SOUTH");
		toyRobotPlace.setAction("MOVE");
		
		ToyRobotSimulation toyRobotSimulation = new ToyRobotSimulation();
		toyRobotSimulation.toyRobotAction(toyRobotPlace);
		
		assertEquals(toyRobotPlace.getReport(), "0:0:SOUTH");
	}

}
