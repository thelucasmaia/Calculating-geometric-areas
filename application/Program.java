package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.color.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int numberOfShapes = sc.nextInt();

		for (int i = 0; i < numberOfShapes; i++) {
			System.out.println("Shape #" + (i + 1) + " data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char typeShape = sc.next().charAt(0);

			if (typeShape == 'r' || typeShape == 'R') {
				System.out.print("Color (BLACK/BLUE/RED): ");
				Color color = Color.valueOf(sc.next());

				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();

				Shape rectangleShape = new Rectangle(color, width, height);

				list.add(rectangleShape);
			}

			else if (typeShape == 'c' || typeShape == 'C') {
				System.out.print("Color (BLACK/BLUE/RED): ");
				Color color = Color.valueOf(sc.next());

				System.out.print("Radius: ");
				double radius = sc.nextDouble();

				Shape circleShape = new Circle(color, radius);

				list.add(circleShape);
			}

		}
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (Shape shape : list) {
			System.out.printf("%.2f%n", shape.area());
		}

		sc.close();
	}

}
