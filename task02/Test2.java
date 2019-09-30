package by.oks.jb29_les09.task02;

/*Создaйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. 
 * Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.*/

public class Test2 {
	int number1;
	int number2;

	public Test2(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public Test2() {
		this.number1 = 5;
		this.number2 = 7;
	}

	public void setNumber1(int number) {
		this.number1 = number;
	}

	public void setNumber2(int number) {
		this.number2 = number;
	}

	public int getNumber1() {
		return this.number1;
	}

	public int getNumber2() {
		return this.number2;
	}
}
