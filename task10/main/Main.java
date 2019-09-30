package by.oks.jb29_les09.task10.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.oks.jb29_les09.task10.bean.Airline;
import by.oks.jb29_les09.task10.bean.Airport;
import by.oks.jb29_les09.task10.logic.DepartureBoard;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). 
 * Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного*/

public class Main {

	public static void main(String[] args) {

		Airport airport = new Airport();

		airport.addAirline(new Airline("Paris", 124, "Boeing", 12, 15,
				new ArrayList<String>(Arrays.asList("среда", "четверг", "воскресенье"))));
		airport.addAirline(new Airline("Kiev", 561, "Airbus", 18, 55,
				new ArrayList<String>(Arrays.asList("понедельник", "четверг", "суббота"))));
		airport.addAirline(new Airline("Minsk", 225, "Boeing", 00, 35,
				new ArrayList<String>(Arrays.asList("вторник", "пятница"))));
		airport.addAirline(
				new Airline("Moscow", 342, "Airbus", 14, 20, new ArrayList<String>(Arrays.asList("среда", "четверг"))));
		airport.addAirline(new Airline("Minsk", 245, "Airbus", 22, 12,
				new ArrayList<String>(Arrays.asList("понедельник", "пятница", "воскресенье"))));

		DepartureBoard board = new DepartureBoard();

		List<Airline> list = new ArrayList<Airline>();
		list = board.findByDeparture(airport, "Minsk");
		board.printAirlinesList(list);

		list = board.findByDayOfWeek(airport, "среда");
		board.printAirlinesList(list);

		list = board.findByDayAndTime(airport, "четверг", 14, 20);
		board.printAirlinesList(list);

	}

}
