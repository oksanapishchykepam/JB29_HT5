package by.oks.jb29_les09.task04;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		RailwayStation trains = new RailwayStation();
		
		trains.addTrain(new Train("Moscow", 293, 12, 34));
		trains.addTrain(new Train("Moscow", 293, 11, 34));
		trains.addTrain(new Train("Moscow", 293, 00, 34));
		//trains.addTrain(new Train("Warsaw", 543, 11, 34));
		//trains.addTrain(new Train("Vilnius", 453, 18, 15));
		trains.addTrain(new Train("Riga", 323, 10, 1));
		trains.addTrain(new Train("Riga", 323, 11, 1));
		//trains.addTrain(new Train("Kiev", 123, 22, 10));
		
		trains.sortByNumber();
		trains.printTrains();
		
		trains.findTrain();
		
		trains.sortByDeparture();
		trains.printTrains();
	}

}
