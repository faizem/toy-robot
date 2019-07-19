package com.toyrobot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This is a Toy Robot class that accepts position,
 * direction and movement actions as argument
 * and execute the instructions sequentially.
 */
public class ToyRobot {

	
	/**
	 * This is the main method to call Toy Robot program.
	 * @param args
	 */
	public static void main(String[] args) {
		
		ToyRobot tr = new ToyRobot();
		
		tr.validateAndMoveRobot();
	}
	
	
	/**
	 * This method validate the arguments passed and execute the movements.
	 * @param args
	 */
	private boolean validateAndMoveRobot()
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
    	String line;
    	ToyRobotPlace toyRobotPlace = new ToyRobotPlace();
    	
    	boolean placeIssued = false;
    	boolean validCommand = false;
    	
    	try {
    		System.out.println("Enter Toy Robot Position : ");
			while ((line = stdin.readLine()) != null && line.length()!= 0) {
			    String[] input = line.split(" ");
			    String action = input[0];
			    validCommand = false;
			    if (ToyRobotConstants.validActions.contains(action))
			    {
				    if((ToyRobotConstants.PLACE.equals(action) && input.length == 4) 
				    		&& ToyRobotConstants.validFaces.contains(input[3])
				    			&& isValidCordinates(input[1])
				    				&& isValidCordinates(input[2]))
				    {
				    	toyRobotPlace.setAction(action);
				    	toyRobotPlace.setxAxis(input[1]);
				    	toyRobotPlace.setyAxis(input[2]);
				    	toyRobotPlace.setFace(input[3]);
				    	
				    	placeIssued = true;
				    	validCommand = true;
				    }
				    else if(!ToyRobotConstants.PLACE.equals(action) && input.length == 1)
				    {
				    	toyRobotPlace.setAction(action);
				    	validCommand = true;
				    }
				    else
				    {
				    	printValidCommand();
				    	validCommand = false;
				    }
			    }
			    else
			    {
			    	printValidCommand();
			    	validCommand = false;
			    }

			    if(placeIssued && validCommand)
				{
					moveRobot(toyRobotPlace);
				}
			    
			    if(ToyRobotConstants.REPORT.equals(action) && placeIssued)
		    	{
		    		break;
		    	}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	return validCommand;
        
	}
	
	/**
	 * This method execute the movements of Robot.
	 */
	private void moveRobot(ToyRobotPlace toyRobotPlace)
	{
		ToyRobotSimulation toyRobotSimulation = new ToyRobotSimulation();
		toyRobotSimulation.toyRobotAction(toyRobotPlace);
	}
	
	/**
	 * This method print the correct usage of instructions for Robot.
	 */
	private void printValidCommand()
	{
		System.out.println("Enter a valid action. \n Usage:"
				+ "\n PLACE <0-5> <0-5> <NORTH/SOUTH/EAST/WEST>"
				+ "\n MOVE/LEFT/RIGHT/REPORT");
	}
	
	/**
	 * This method validates x and y coordinates passed 
	 * as position of Robot.
	 * @param cordinates
	 * @return
	 */
	private boolean isValidCordinates(String coordinates)
	{
		boolean validPosition = false;
		try 
		{
			int position = Integer.parseInt(coordinates);
			
			if(position >=ToyRobotConstants.MIN_UNIT && position <=ToyRobotConstants.MAX_UNIT)
			{
				validPosition =  true;
			}
		}
		catch(NumberFormatException e)
		{
			validPosition =  false;
		}
		
		return validPosition;
	}
}
