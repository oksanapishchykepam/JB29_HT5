package by.oks.jb29_les09.task10.bean;

import java.util.ArrayList;
import java.util.List;

public class Airport {
	private List<Airline> airport;

	public Airport() {
		airport = new ArrayList<Airline>();
	}

	public void addAirline(Airline airline) {
		airport.add(airline);
	}

	public void removeAirline(Airline airline) {
		airport.remove(airline);
	}

	public List<Airline> getAirport() {
		return airport;
	}

}
