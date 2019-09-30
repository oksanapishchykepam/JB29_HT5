package by.oks.jb29_les09.task01;

/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
 * Добавьте метод, который находит сумму значений этих переменных, 
 * и метод, который находит наибольшее значение из этих двух переменных.*/

public class Test1 {
	private int variable1 = 3;
	private int variable2 = 4;

	public int maxVariable() {
		int max = variable1;

		if (variable2 > variable1) {
			max = variable2;
		}

		return max;
	}

	public int sumOfVariables() {
		int sum;
		sum = variable1 + variable2;

		return sum;
	}

	public void printVariable1() {
		System.out.println(variable1);
	}

	public void printVariable2() {
		System.out.println(variable2);
	}

	public void changeVariable1(int number) {
		variable1 = number;
	}

	public void changeVariable2(int number) {
		variable2 = number;
	}

}
