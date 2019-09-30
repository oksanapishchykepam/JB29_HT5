package by.oks.jb29_les09.task06;

/*Составьте описание класса для представления времени. 
 * Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. 
 * В случае недопустимых значений полей поле устанавливается в значение 0. 
 * Создать методы изменения времени на заданное количество часов, минут и секунд.*/

public class TimeStamp {
	private int hours;
	private int minutes;
	private int seconds;
	
	public TimeStamp() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}
	
	public void changeTime(int hours, int minutes, int seconds) {
		this.seconds+= seconds;
		if(this.seconds >= 60) {
			this.seconds = this.seconds - 60;
			this.minutes+= 1;
		}
		
		this.minutes+= minutes;
		if(this.minutes >= 60) {
			this.minutes = this.minutes - 60;
			this.hours+= 1;
		}
		
		this.hours+= hours;
		if(this.hours >= 24) {
			this.hours = this.hours - 24;
		}
	}
	
	public TimeStamp(int hours, int minutes, int seconds) {
		if(hours >= 0 && hours < 24) {
			this.hours = hours;
		} else {
			this.hours = 0;
		}
		
		if(minutes >= 0 && minutes < 60) {
			this.minutes = minutes;
		} else {
			this.minutes = 0;
		}
		
		if(seconds >= 0 && seconds < 60) {
			this.seconds = seconds;
		} else {
			this.seconds = 0;
		}
	}
	
	public int getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		if(hours >= 0 && hours < 24) {
			this.hours = hours;
		} else {
			this.hours = 0;
		}
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public void setMinutes(int minutes) {
		if(minutes >= 0 && minutes < 60) {
			this.minutes = minutes;
		} else {
			this.minutes = 0;
		}
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public void setSeconds(int seconds) {
		if(seconds >= 0 && seconds < 60) {
			this.seconds = seconds;
		} else {
			this.seconds = 0;
		}
	}
	
	public String getTime() {
		String time = hours + "ч " + minutes + "мин " + seconds + "с";
		return time;
	}
}
