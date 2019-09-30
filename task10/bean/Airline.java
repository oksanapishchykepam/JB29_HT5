package by.oks.jb29_les09.task10.bean;

import java.util.ArrayList;
import java.util.List;

import by.oks.jb29_les09.task06.TimeStamp;

/*Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.*/

public class Airline {
	String destination;
	int flightNumber;
	String airlineType;
	TimeStamp departureTime;
	List<String> daysOfWeek;

	public Airline(String destination, int flightNumber, String airlineType, int hours, int minutes,
			List<String> daysOfWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.airlineType = airlineType;

		this.departureTime = new TimeStamp();
		this.departureTime.setHours(hours);
		this.departureTime.setMinutes(minutes);

		this.daysOfWeek = daysOfWeek;
	}

	public Airline() {
		this.destination = "";
		this.flightNumber = 0;
		this.airlineType = "";
		this.departureTime = new TimeStamp();
		this.daysOfWeek = new ArrayList<String>();
	}

	@Override
	public String toString() {
		return destination + ", рейс " + flightNumber + ", " + airlineType + ", время вылета: "
				+ departureTime.getHours() + "ч " + departureTime.getMinutes() + "мин, дни вылета: " + daysOfWeek + ".";
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirlineType() {
		return airlineType;
	}

	public void setAirlineType(String airlineType) {
		this.airlineType = airlineType;
	}

	public TimeStamp getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int hours, int minutes) {
		this.departureTime.setHours(hours);
		this.departureTime.setMinutes(minutes);
	}

	public List<String> getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(List<String> daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

}
