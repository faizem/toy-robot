package com.toyrobot;

import java.util.Map;

/**
 * This class perform the simulation of ToyRobot.
 *
 */
public class ToyRobotSimulation {

	/**
	 * This method takes ToyRobotPlace object and executes the instructions
	 * to move around the grid.
	 * @param toyRobotPlace
	 */
	public void toyRobotAction(ToyRobotPlace toyRobotPlace)
	{
		Map <String, Integer> facesMap = new ToyRobotFaceMap().getFacesMap();
		
		int facePosition = facesMap.get(toyRobotPlace.getFace());
		
		if(ToyRobotConstants.REPORT.equals(toyRobotPlace.getAction()))
		{
			System.out.println(toyRobotPlace.getxAxis() + ":" + toyRobotPlace.getyAxis() + ":" + toyRobotPlace.getFace());
		}
		else if (ToyRobotConstants.LEFT.equals(toyRobotPlace.getAction()))
		{
			facePosition = facePosition - 1;
			if(facePosition < 0)
			{
				facePosition = 3;
			}
		}
		else if (ToyRobotConstants.RIGHT.equals(toyRobotPlace.getAction()))
		{
			facePosition = facePosition + 1;
			if(facePosition > 3)
			{
				facePosition = 0;
			}
		}
		
		toyRobotPlace.setFace(getKey(facesMap, facePosition));
		
		
		
		if (ToyRobotConstants.MOVE.equals(toyRobotPlace.getAction()))
		{
			if (ToyRobotConstants.NORTH.equals(toyRobotPlace.getFace()))
			{
				int newY = Integer.parseInt(toyRobotPlace.getyAxis()) + 1;
				toyRobotPlace.setyAxis(newY > ToyRobotConstants.MAX_UNIT ? toyRobotPlace.getyAxis() : String.valueOf(newY));
			}
			else if (ToyRobotConstants.SOUTH.equals(toyRobotPlace.getFace()))
			{
				int newY = Integer.parseInt(toyRobotPlace.getyAxis()) - 1;
				toyRobotPlace.setyAxis(newY < ToyRobotConstants.MIN_UNIT ? toyRobotPlace.getyAxis() : String.valueOf(newY));
			}
			else if (ToyRobotConstants.EAST.equals(toyRobotPlace.getFace()))
			{
				int newX = Integer.parseInt(toyRobotPlace.getxAxis()) + 1;
				toyRobotPlace.setxAxis(newX > ToyRobotConstants.MAX_UNIT ? toyRobotPlace.getxAxis() : String.valueOf(newX));
			}
			else if (ToyRobotConstants.WEST.equals(toyRobotPlace.getFace()))
			{
				int newX = Integer.parseInt(toyRobotPlace.getxAxis()) - 1;
				toyRobotPlace.setxAxis(newX < ToyRobotConstants.MIN_UNIT ? toyRobotPlace.getxAxis() : String.valueOf(newX));
			}
		}
	}
	
	/**
	 * This method iterate a Map and returns the key for a corresponding value.
	 * @param <K>
	 * @param <V>
	 * @param map
	 * @param value
	 * @return
	 */
	private <K, V> K getKey(Map<K, V> map, V value) {
		for (K key : map.keySet()) {
			if (value.equals(map.get(key))) {
				return key;
			}
		}
		return null;
	}
}
