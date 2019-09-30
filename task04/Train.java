package by.oks.jb29_les09.task04;

import java.util.Date;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления*/

public class Train {
	private String destination;
	private int trainNumber;
	private Date departureTime;
	
	public Train(String destination, int trainNumber, int hours, int minutes) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		
		Date time = new Date();
		time.setHours(hours);
		time.setMinutes(minutes);
		
		this.departureTime = time;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public int getTrainNumber() {
		return trainNumber;
	}
	
	public Date getDepartureTime() {
		return departureTime;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public void setDepartureTime(int hours, int minutes) {
		Date time = new Date();
		time.setHours(hours);
		time.setMinutes(minutes);
		
		this.departureTime = time;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
}
