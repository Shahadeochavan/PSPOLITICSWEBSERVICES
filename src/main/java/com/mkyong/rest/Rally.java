package com.mkyong.rest;

public class Rally {
	private String startPoint;
	private String endPoint;
	private String date;
	private String  startTime;
	private String endTime;
	private String rallyDay;
	
	public String getRallyDay() {
		return rallyDay;
	}
	public void setRallyDay(String rallyDay) {
		this.rallyDay = rallyDay;
	}
	public String getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}
	public String getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
@Override
public String toString()
{
	return "Rally [startPoint=" +  startPoint+ ", endpoint=" + endPoint + ", startTime=" + startTime + ", endTime=" + endTime + ", date=" + date + "]";
}

}
