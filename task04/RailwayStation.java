package by.oks.jb29_les09.task04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class RailwayStation {
	
	public List<Train> trains;
	
	public RailwayStation() {
		trains = new ArrayList<Train>();
	}

	public void addTrain(Train newTrain) {
		trains.add(newTrain);
	}
	
	public void printTrains() {
		for(int i = 0; i < trains.size(); i++) {
			System.out.println(trains.get(i).getDestination() + ", " + trains.get(i).getTrainNumber() + ", " + trains.get(i).getDepartureTime().getHours() + ":" +  trains.get(i).getDepartureTime().getMinutes());
		}
	}
	
	public void findTrain() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номер поезда > ");
		
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Вы ввели не целое число. Попробуйте еще раз > ");
		}
		
		int trainNumber = sc.nextInt();
		
		for(int i = 0; i < trains.size(); i++) {
			if(trainNumber == trains.get(i).getTrainNumber()) {
				System.out.println(trains.get(i).getDestination() + ", " + trains.get(i).getTrainNumber() + ", " + trains.get(i).getDepartureTime());
			}
		}
	}
	
	public void sortByDeparture() {
		Collections.sort(trains, new Comparator<Train>() {
			@Override
			public int compare(Train t1, Train t2) {
				return t1.getDestination().compareToIgnoreCase(t2.getDestination());
			}
		});
		
		
		boolean continueSorting = true;
		while(continueSorting) {
			continueSorting = false;
			
			for(int i = 0; i < trains.size() - 1; i++) {
				Train temp = trains.get(i);
				Date date1 = trains.get(i).getDepartureTime();
							
				Date date2 = trains.get(i + 1).getDepartureTime();
						
					if(trains.get(i).getDestination() == trains.get(i + 1).getDestination()) {
						if(date1.compareTo(date2) > 0) {
							trains.set(i, trains.get(i + 1));
							trains.set(i + 1, temp);
								
							temp = trains.get(i);
							continueSorting = true;
						}
					}
				}
			}

				
		}
	
	public void sortByNumber() {
		Train temp;
		
		for(int i = 0; i < trains.size() - 1; i++) {
			temp = trains.get(i);
			
			for(int j = i + 1; j < trains.size(); j++) {
				if(trains.get(j).getTrainNumber() > temp.getTrainNumber()) {
					trains.set(i, trains.get(j));
					trains.set(j, temp);
					temp = trains.get(i);
				}
			}
			
		}
		
	}
	
	public List<Train> getTrains(){
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}
}

