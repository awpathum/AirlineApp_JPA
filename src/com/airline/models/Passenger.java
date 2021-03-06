package com.airline.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: Passenger
 *
 */
@Entity
@XmlRootElement
public class Passenger implements Serializable {

	@Transient
	// this will not map to a column
	private static final long serialVersionUID = 1L;

	public Passenger() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// To generate id automatically
	private Integer id;

	private String firstName;
	private String lastName;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Enumerated(EnumType.STRING)
	// To save enum value as a String. unless it will save as index value of the
	// enum.
	private Gender gender;

	@Enumerated(EnumType.STRING)
	private FlightClass flightclass;

	@ManyToMany(mappedBy = "passengers")
	private List<Flight> flights; // the flight tickets passenger has

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public FlightClass getFlightclass() {
		return flightclass;
	}

	public void setFlightclass(FlightClass flightclass) {
		this.flightclass = flightclass;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", dob=" + dob + ", gender="
				+ gender + ", flightclass=" + flightclass + "]";
	}

}
