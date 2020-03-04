package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.models.FlightClass;
import com.airline.models.Gender;
import com.airline.models.Passenger;
import com.airline.service.PassengerService;

/**
 * Servlet implementation class AddPassenger
 */
@WebServlet("/AddPassenger")
public class AddPassenger extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	PassengerService ps;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddPassenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

//		Passenger p = new Passenger();
//
//		p.setFirstName("Pathum");
//		p.setLastName("Wijethunge");
//
//		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.YEAR, 1995);
//		cal.set(Calendar.MONTH, 9);
//		cal.set(Calendar.DAY_OF_MONTH, 15);
//
//		Date dob = cal.getTime();
//		p.setDob(dob);
//
//		p.setGender(Gender.Male);
//		p.setFlightclass(FlightClass.Coach);
//		
//		System.out.println(p);
//		
//		ps.addPassenger(p);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		//response.sendRedirect("Passengers");
		
		PrintWriter out = response.getWriter();
		out.println("AddPassenger Called");
		
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		String raw_dob = request.getParameter("dob");
//		String year = request.getParameter("year");
//		String month = request.getParameter("month");
//		String day = request.getParameter("day");
		String gender = request.getParameter("gender");
		
		String dobArr[] = raw_dob.split("\\/");
		Passenger p = new Passenger();

		p.setFirstName(firstName);
		p.setLastName(lastName);

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.parseInt(dobArr[2]));
		cal.set(Calendar.MONTH, Integer.parseInt(dobArr[1]));
		cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dobArr[0]));

		Date dob = cal.getTime();
		p.setDob(dob);

		p.setGender(Gender.valueOf(gender));
		p.setFlightclass(FlightClass.Coach);
		
		System.out.println(p);
		
		ps.addPassenger(p);
		response.sendRedirect("Passengers");
	}

}
