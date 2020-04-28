package com.cap.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
//import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "bookinglist")
public class BookingDetails implements Serializable{
	@Id
	@GeneratedValue
    private Integer bookingId;
	private int userId;
	private int noofSeats;
	private String passengerName;
	/*@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="flightNumber")
	private ScheduledFlights schedule;*/
	
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getNoofSeats() {
		return noofSeats;
	}
	public void setNoofSeats(int noofSeats) {
		this.noofSeats = noofSeats;
	}


	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public BookingDetails() {
		super();
	}
	public BookingDetails(Integer bookingId, int userId, int noofSeats, String passengerName) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.noofSeats = noofSeats;
		this.passengerName = passengerName;
	}
	
	
	
}
