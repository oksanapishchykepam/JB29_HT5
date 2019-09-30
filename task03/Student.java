package by.oks.jb29_les09.task03;

import java.util.Random;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
 * Создайте массив из десяти элементов такого типа. 
 * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class Student {
	String name;
	int groupNumber;
	
	int[] performance = new int[5];
	
	public Student(String name, int groupNumber, int mark1, int mark2, int mark3, int mark4, int mark5) {
		this.name = name;
		this.groupNumber = groupNumber;
		
		performance[0] = mark1;
		performance[1] = mark2;
		performance[2] = mark3;
		performance[3] = mark4;
		performance[4] = mark5;
	}
	
	public void printNameAndGroup() {
		System.out.println(name + ", группа " + groupNumber);
	}
	
	public boolean isAStudent() {
		boolean isAStudent = true;
		
		int count = 0;
		while(count < performance.length) {
			if(performance[count] < 9) {
				isAStudent = false;
				break;
			}
			count++;
		}

		return isAStudent;
	}
	
	public void printPerformance() {
		for(int i = 0; i < performance.length; i++) {
			System.out.print(performance[i] + " ");
		}
		System.out.println();
	}
	
	public void generatePerformance() {
		Random rand = new Random();
		
		for(int i = 0; i < performance.length; i++) {
			performance[i] = rand.nextInt(10);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getPerformance() {
		return performance;
	}

	public void setPerformance(int[] performance) {
		this.performance = performance;
	}
	
}
