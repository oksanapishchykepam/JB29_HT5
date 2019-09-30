package by.oks.jb29_les09.task07;

import static java.lang.Math.*;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.*/

public class Triangle {
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Triangle(double xA, double yA, double xB, double yB, double xC, double yC) {
		this.pointA = new Point(xA, yA);
		this.pointB = new Point(xB, yB);
		this.pointC = new Point(xC, yC);
	}

	public Point intersectionOfMedian() {
		Point median = new Point(0, 0);

		double x = (pointA.getX() + pointB.getX() + pointC.getX()) / 3;
		double y = (pointA.getY() + pointB.getY() + pointC.getY()) / 3;

		median.setX(x);
		median.setY(y);

		return median;
	}

	public double getSide(Point point1, Point point2) {
		double side;

		double cathet1 = abs(point1.getX() - point2.getX());
		double cathet2 = abs(point1.getY() - point2.getY());

		side = sqrt(pow(cathet1, 2) + pow(cathet2, 2));

		return side;
	}

	public double square() {
		double square = 0;
		double halfPerimeter = perimeter() / 2;
		square = sqrt(halfPerimeter * (halfPerimeter - getSide(pointA, pointB)) * (halfPerimeter - getSide(pointA, pointC)) * (halfPerimeter - getSide(pointB, pointC)));

		return square;
	}

	public double perimeter() {
		double perimeter = getSide(pointA, pointB) + getSide(pointA, pointC) + getSide(pointB, pointC);
		return perimeter;
	}

}
