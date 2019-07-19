package com.toyrobot;

/**
 * This is an object class for arguments passed to ToyRobot application.
 *
 */
public class ToyRobotPlace {

	private String action;
	private String xAxis;
	private String yAxis;
	private String face;
	private String report;
	
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getxAxis() {
		return xAxis;
	}
	public void setxAxis(String xAxis) {
		this.xAxis = xAxis;
	}
	public String getyAxis() {
		return yAxis;
	}
	public void setyAxis(String yAxis) {
		this.yAxis = yAxis;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	
	public String getReport() {
		this.report =  xAxis + ":" + yAxis + ":" + face;
		return report;
	}
	
	public void setReport(String xAxis, String yAxis, String face) {
		this.report = xAxis + ":" + yAxis + ":" + face;
	}
}
