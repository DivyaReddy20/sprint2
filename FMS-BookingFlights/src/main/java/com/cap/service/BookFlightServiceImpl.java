package com.cap.service;


import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.BookFlightDao;
import com.cap.dao.FlightDao;
import com.cap.dto.BookingDetails;
import com.cap.dto.Flight;

@Service
@Transactional
public class BookFlightServiceImpl implements BookFlightService{
	@Autowired
    private BookFlightDao bookingdao;
	@Autowired
    private FlightDao dao;
	
	public FlightDao getDao(){
        return dao;
    }
	@Override
	public List<Flight> displayFlights() {
		List<Flight> flights= dao.findAll();
		return flights;
		
	}
	@Override
	public List<Flight> bookingFlights(String from_loc,String to_loc,Date date1) {
		List<Flight> flights1=dao.findByLocations(from_loc,to_loc,date1);
		return flights1;
	}
	@Override
	public String updateSeats(Flight flight,BookingDetails book) {
        
			dao.save(flight);
			return "seats were updated successfully!!";
	
	}
	@Override
	 public void addBookingDetails(BookingDetails booking)
	    {

	      bookingdao.save(booking);
	     
	    }

@Override
public void updateBookingDetails(BookingDetails booking)
   {
	bookingdao.delete(booking);
     bookingdao.save(booking);
	}
@Override
public List<BookingDetails> displayBookingList() {
	List<BookingDetails> list= bookingdao.findAll();
	return list;
}
	@Override
	public Optional<BookingDetails> displayOneBookingList(Integer bookingId) {
		Optional<BookingDetails> list= bookingdao.findById(bookingId);
		return list;
	}
}
