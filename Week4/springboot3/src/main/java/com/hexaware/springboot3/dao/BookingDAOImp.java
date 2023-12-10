package com.hexaware.springboot3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.springboot3.entity.Bookings;




public class BookingDAOImp implements IBookingsDAO {
	Connection conn = DBUtil.getDBConnection();

	@Override
	public int createBookings(Bookings bookings) {

		String insertQuery = "insert into bookings values(?,?,?,?,?,?)";

		int count = 0;

		try {

			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, bookings.getBooking_ID());
			pstmt.setInt(2, bookings.getUser_ID());
			pstmt.setInt(3, bookings.getTrip_ID());
			pstmt.setString(4, bookings.getBooking_Time());
			pstmt.setInt(5, bookings.getSeat_Number());
			pstmt.setString(6, bookings.getBooking_Status());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// insert query

		return count;
	}


	@Override
	public List<Bookings> getAllBookings() {
		List<Bookings> list = new ArrayList<Bookings>();

		String selectAll = "select * from bookings";

		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(selectAll);
			
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int Booking_ID = rs.getInt("Booking_ID");
				int User_ID = rs.getInt("User_ID");
				int Trip_ID= rs.getInt("Trip_ID");
				String cname = rs.getString("cname");
				int Booking_Time= rs.getInt("Booking_Time");
				String Booking_Status = rs.getString("Booking_Status");
				

				Bookings book = new Bookings();

				list.add(book);

			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return list;
	

	}


	

}