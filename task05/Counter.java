package by.oks.jb29_les09.task05;

/*Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне. 
 * Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. 
 * Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние. 
 * Написать код, демонстрирующий все возможности класса.*/

public class Counter {
	private int currentState;
	private int minState;
	private int maxState;
	
	public Counter() {
		currentState = 1;
		minState = 1;
		maxState = 10;
	}
	
	public Counter(int currentState, int minState, int maxState) {
		this.currentState = currentState;
		this.minState = minState;
		this.maxState = maxState;
	}
	
	public void increaseCounter() {
		if(currentState < maxState) {
			currentState = currentState + 1;
		} else {
			currentState = minState;
		}
	}
	
	public void decreaseCounter() {
		if(currentState > minState) {
			currentState = currentState - 1;
		} else {
			currentState = maxState;
		}
	}
	
	public int getCurrentState() {
		return currentState;
	}
	public void setCurrentState(int currentState) {
		if(currentState >= this.minState && currentState <= this.maxState) {
			this.currentState = currentState;
		} else {
			System.out.println("Установлено минимальное значение счетчика, так как ыв ввели недопустимое число");
			this.currentState = this.minState;
		}
			
	}
	public int getMinState() {
		return minState;
	}
	public void setMinState(int minState) {
		this.minState = minState;
	}
	public int getMaxState() {
		return maxState;
	}
	public void setMaxState(int maxState) {
		this.maxState = maxState;
	}
	
}
