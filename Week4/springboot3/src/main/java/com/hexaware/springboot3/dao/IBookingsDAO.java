package com.hexaware.springboot3.dao;

import java.util.List;

import com.hexaware.springboot3.entity.Bookings;



public interface IBookingsDAO {
	public int createBookings(Bookings bookings);
	public List<Bookings>getAllBookings();

}
