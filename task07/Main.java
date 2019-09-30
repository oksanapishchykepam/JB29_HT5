package by.oks.jb29_les09.task07;

public class Main {

	public static void main(String[] args) {
		Triangle tr = new Triangle(0, 0, 0, 5, 5, 0);
		
		double perimeter = tr.perimeter();
		double square = tr.square();
		
		Point median = tr.intersectionOfMedian();
		
		System.out.println("Периметр треугольника = " + perimeter);
		System.out.println("Площадь треугольника = " + square);
		
		System.out.println("Точка пересечения медиан = (" + median.getX() + ", " + median.getY() + ").");
	}

}
