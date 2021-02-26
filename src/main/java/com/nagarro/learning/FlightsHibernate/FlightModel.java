package com.nagarro.learning.FlightsHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FlightsData")
public class FlightModel {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "FLIGHT_NO")
	private String flightNum;
	@Column(name = "DEP_LOC")
	private String depLocation;
	@Column(name = "ARR_LOC")
	private String arrLocation;
	@Column(name = "VALID_TILL")
	private String validDate;
	@Column(name = "FLIGHT_TIME")
	private Integer flightTime;
	@Column(name = "FLIGHT_FARE")
	private Integer flightFare;
	@Column(name = "SEAT_AVAIL")
	private String seatAvail;
	@Column(name = "FLIGHT_CLASS")
	private String classType;
	@Column(name = "FLIGHT_DUR")
	private String flightDuration;
	public String getFlightNum() {
		return flightNum;
	}
	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}
	public String getDepLocation() {
		return depLocation;
	}
	public void setDepLocation(String depLocation) {
		this.depLocation = depLocation;
	}
	@Override
	public String toString() {
		return "FlightModel [flightNum=" + flightNum + ", depLocation=" + depLocation + ", arrLocation=" + arrLocation
				+ ", validDate=" + validDate + ", flightTime=" + flightTime + ", flightFare=" + flightFare
				+ ", seatAvail=" + seatAvail + ", classType=" + classType + ", flightDuration=" + flightDuration + "]";
	}
	public String getArrLocation() {
		return arrLocation;
	}
	public void setArrLocation(String arrLocation) {
		this.arrLocation = arrLocation;
	}
	public String getValidDate() {
		return validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
	public Integer getFlightTime() {
		return flightTime;
	}
	public void setFlightTime(String flightTime) {
		this.flightTime = Integer.parseInt(flightTime);
	}
	public Integer getFlightFare() {
		return flightFare;
	}
	public void setFlightFare(String flightFare) {
		this.flightFare = Integer.parseInt(flightFare);
	}
	public String getSeatAvail() {
		return seatAvail;
	}
	public void setSeatAvail(String seatAvail) {
		this.seatAvail = seatAvail;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public String getFlightDuration() {
		return flightDuration;
	}
	public void setFlightDuration(String flightDuration) {
		this.flightDuration = flightDuration;
	}
}
