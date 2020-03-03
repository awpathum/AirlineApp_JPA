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

import com.airline.models.Airplane;
import com.airline.models.Flight;
import com.airline.models.FlightDestinations;
import com.airline.service.FlightService;

/**
 * Servlet implementation class AddFlight
 */
@WebServlet("/AddFlight")
public class AddFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	FlightService fs;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddFlight() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		// out.println("AddFlight Called");
		Flight f = new Flight();

		String from_destination = request.getParameter("from_destination");
		f.setFlightOrigin(FlightDestinations.valueOf(from_destination));

		String to_destination = request.getParameter("to_destination");
		f.setFlightDestinations(FlightDestinations.valueOf(to_destination));

		String price = request.getParameter("price");
		f.setPrice(Integer.parseInt(price));

		Integer year = Integer.parseInt(request.getParameter("year"));
		Integer month = Integer.parseInt(request.getParameter("month"));
		Integer day = Integer.parseInt(request.getParameter("day"));
		Integer hour = Integer.parseInt(request.getParameter("hour"));
		Integer minute = Integer.parseInt(request.getParameter("minute"));

		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.YEAR, 2014);
		cal.set(Calendar.MONTH, 10);
		cal.set(Calendar.DAY_OF_MONTH, 19);
		cal.set(Calendar.HOUR_OF_DAY, 19);
		cal.set(Calendar.MINUTE, 0);

		Date flightTime = cal.getTime();

		f.setFlightTime(flightTime);

		System.out.println(flightTime);

		Airplane a = new Airplane();

		String planeMake = request.getParameter("airplane_make");
		a.setModelName(planeMake);

		String planeModelName = request.getParameter("airplane_model");
		a.setPlaneMake(planeModelName);
		Integer seating = Integer.parseInt(request
				.getParameter("airplane_seating"));
		a.setSeatingCapacity(seating);

		f.setAirplaneDetail(a);

		System.out.println(f);
		System.out.println(a);

		fs.addFlight(f, a);

		response.sendRedirect("Flights");

	}

}
