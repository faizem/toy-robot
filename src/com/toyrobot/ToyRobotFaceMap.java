package com.toyrobot;

import java.util.HashMap;
import java.util.Map;

/**
 * This class declare and initialise a Map that stores 
 * all faces and a constant value as key value pair.
 *
 */
public class ToyRobotFaceMap {

	private Map <String, Integer> facesMap = new HashMap <String, Integer> ();

	public Map <String, Integer> getFacesMap() {
		return facesMap;
	}

	public void setFacesMap(Map <String, Integer> facesMap) {
		this.facesMap = facesMap;
	}
	
	ToyRobotFaceMap ()
	{
		initialize();
	}
	
	/**
	 * This method initialise faceMap.
	 */
	public void initialize()
	{
		facesMap.put(ToyRobotConstants.NORTH, 0);
		facesMap.put(ToyRobotConstants.EAST, 1);
		facesMap.put(ToyRobotConstants.SOUTH, 2);
		facesMap.put(ToyRobotConstants.WEST, 3);
	}
}
