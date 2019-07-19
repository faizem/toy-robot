package com.toyrobot;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This is a constant class for ToyRobot application.
 *
 */
public class ToyRobotConstants {

	static String NORTH = "NORTH";
	static String SOUTH = "SOUTH";
	static String EAST = "EAST";
	static String WEST = "WEST";
	
	static String PLACE = "PLACE";
	static String MOVE = "MOVE";
	static String LEFT = "LEFT";
	static String RIGHT = "RIGHT";
	static String REPORT = "REPORT";
	
	static ArrayList <String> validActions = 
			new ArrayList <String> (Arrays.asList("PLACE", "MOVE", "LEFT", "RIGHT", "REPORT"));
	
	static ArrayList <String> validFaces = 
			new ArrayList <String> (Arrays.asList("NORTH", "SOUTH", "EAST", "WEST"));
	
	static int MAX_UNIT = 5;
	static int MIN_UNIT = 0;

}
