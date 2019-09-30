package by.oks.jb29_les09.task10.logic;

import java.util.ArrayList;
import java.util.List;

import by.oks.jb29_les09.task10.bean.Airline;
import by.oks.jb29_les09.task10.bean.Airport;

/*a) список рейсов для заданного пункта назначения;
 *b) список рейсов для заданного дня недели;
 *c) список рейсов для заданного дня недели, время вылета для которых больше заданного*/

public class DepartureBoard {

	private List<Airline> list = new ArrayList<Airline>();
	private Airline airline = new Airline();

	public List<Airline> findByDeparture(Airport airport, String destination) {
		list.removeAll(list);
		
		for (int i = 0; i < airport.getAirport().size(); i++) {
			airline = airport.getAirport().get(i);
			if (airline.getDestination() == destination) {
				list.add(airline);
			}
		}

		return list;
	}

	public List<Airline> findByDayOfWeek(Airport airport, String dayOfWeek) {
		list.removeAll(list);
		
		for (int i = 0; i < airport.getAirport().size(); i++) {
			airline = airport.getAirport().get(i);
			if (airline.getDaysOfWeek().contains(dayOfWeek)) {
				list.add(airline);
			}
		}

		return list;
	}

	public List<Airline> findByDayAndTime(Airport airport, String dayOfWeek, int hours, int minutes) {
		list.removeAll(list);
		
		list = findByDayOfWeek(airport, dayOfWeek);

		for (int i = 0; i < list.size(); i++) {
			airline = list.get(i);

			if (airline.getDepartureTime().getHours() <= hours) {
				if (airline.getDepartureTime().getMinutes() < minutes) {
					list.remove(airline);
				}
			}
		}

		return list;
	}

	public void printAirlinesList(List<Airline> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
	}
}
