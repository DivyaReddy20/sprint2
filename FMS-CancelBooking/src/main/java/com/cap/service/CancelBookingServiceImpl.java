package com.cap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.CancelBookingDao;


@Service
@Transactional
public class CancelBookingServiceImpl implements CancelBookingService {
	@Autowired
    private CancelBookingDao dao;
	@Override
	public String deleteBookingDetails(Integer bookingId)
    {
		boolean result=dao.existsById(bookingId);
		if(result) {
			
	        dao.deleteById(bookingId);
			return "deleted the emp details";
		}
		else 
			return "id is not present";
    }
}
