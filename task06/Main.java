package by.oks.jb29_les09.task06;

public class Main {

	public static void main(String[] args) {
		TimeStamp time = new TimeStamp();
		
		time.setHours(12);
		time.setMinutes(34);
		time.setSeconds(57);
		
		System.out.println(time.getTime());
		
		time.changeTime(2, 35, 50);
		System.out.println(time.getTime());

	}

}
