<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bus Booking System</title>
</head>
<body>
<h1 style='color: purple'> WELCOME TO BOOKING FORM </h1>
	
		<form  action="http://localhost:8080/bookings/openform"  method="get">
			
			BOOKINGID: <input type="number"  name="Booking Id"> <br/>
			USERID: <input type="number"  name="User Id"> <br/>
			TRIPID: <input type="number"  name="Trip Id"> <br/>
			
		    BOOKINGTIME: <input type="text"  name="Booking Time"> <br/>
			SEATNO: <input type="number"  name="Seat No."> <br/>
			BOOKINGSTATUS: <input type="text"  name="Booking Status"> <br/>
			
			<button type="submit">Add</button>
			
			
		</form>

</body>
</html>