package com.airline.controllers;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.service.FlightService;
<<<<<<< HEAD
import com.airline.service.PassengerService;
=======
>>>>>>> master

/**
 * Servlet implementation class AddPassengerToFlight
 */
@WebServlet("/AddPassengerToFlight")
public class AddPassengerToFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
	@EJB
	FlightService fs;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPassengerToFlight() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
=======

	@EJB
	FlightService fs;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddPassengerToFlight() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
>>>>>>> master
		// TODO Auto-generated method stub
	}

	/**
<<<<<<< HEAD
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pid = request.getParameter("pid");
		String fid = request.getParameter("fid");
		
		fs.addPassengerToFlight(pid, fid);
		response.sendRedirect("Flights");
		
		
		
		
=======
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String pid = (String) request.getAttribute("pid");
		String fid = (String) request.getAttribute("fid");
		
		//fs.addPassengerToFlight(pid, fid);
		
		response.sendRedirect("Flights");
		
		
>>>>>>> master
	}

}
