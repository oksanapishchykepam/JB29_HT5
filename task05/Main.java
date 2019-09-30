package by.oks.jb29_les09.task05;

public class Main {

	public static void main(String[] args) {
		Counter counter = new Counter(0, -10, 10);
		
		// получить и вывести текущее значение
		System.out.println("Текущее состояние = " + counter.getCurrentState());
		
		// увеличение счетчика на единицу
		counter.increaseCounter();
		System.out.println("После увеличения на 1 = " + counter.getCurrentState());
		
		// уменьшение счетчика
		counter.decreaseCounter();
		counter.decreaseCounter();
		counter.decreaseCounter();
		System.out.println("После уменьшения на 3 = " + counter.getCurrentState());
		
		counter.setCurrentState(10);
		counter.increaseCounter();
		System.out.println("После увеличения максимального значения на 1 = " + counter.getCurrentState());
		
		counter. decreaseCounter();
		System.out.println("После уменьшения минимального значения на 1 = " + counter.getCurrentState());

	}

}
