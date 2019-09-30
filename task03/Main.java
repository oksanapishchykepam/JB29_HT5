package by.oks.jb29_les09.task03;

public class Main {

	public static void main(String[] args) {
		
		Student[] students = new Student[10];
		
		students[0] = new Student("Иванов А.И.", 400241, 8, 9, 10, 7, 6);
		students[1] = new Student("Петров М.П.", 400241, 7, 9, 10, 9, 6);
		students[2] = new Student("Васечкин Н.А.", 400241, 10, 9, 10, 7, 9);
		students[3] = new Student("Лисицин Л.К.", 400241, 8, 9, 10, 9, 9);
		students[4] = new Student("Пушкарев Д.И.", 400241, 9, 9, 10, 9,9);
		students[5] = new Student("Иванова А.П.", 400241, 9, 9, 10, 9, 6);
		students[6] = new Student("Нечаева О.И.", 400241, 8, 9, 10, 9, 6);
		students[7] = new Student("Васильева З.П.", 400241, 10, 9, 10, 9, 10);
		students[8] = new Student("Куницина Р.Ф.", 400241, 8, 9, 10, 10, 6);
		students[9] = new Student("Кот А.Л.", 400241, 10, 9, 10, 9, 9);

		printOnlyAStudents(students);

	}

	public static void printOnlyAStudents(Student[] students) {
		for(int i = 0; i < students.length; i++) {
			if(students[i].isAStudent()) {
				students[i].printNameAndGroup();
			}
		}
	}
	
}
