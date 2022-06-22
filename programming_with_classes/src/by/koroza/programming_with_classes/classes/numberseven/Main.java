/* Описать класс, представляющий треугольник. 
 * Предусмотреть методы для создания объектов, 
 * вычисления площади, периметра и точки пересечения медиан. 
 */

package by.koroza.programming_with_classes.classes.numberseven;

public class Main {
	static final String CREATE_TRIANGLE_EMPTY_CONSTRUCTOR = "Create triangle with empty constructor";
	static final String CREATE_TRIANGLE_CONSTRUCTOR_SIDES_AND_POINT_OBJECTS = "Create triangle with constructor with sides and coordinates (enter objects)";
	static final String CREATE_TRIANGLE_CONSTRUCTOR_SIDES_AND_POINT_NUMBERS = "Create triangle with constructor with sides and coordinates (enter number)";
	static final String CREATE_TRIANGLE_CONSTRUCTOR_SIDES = "Create triangle with constructor with sides";
	static final String CREATE_TRIANGLE_CONSTRUCTOR_POINT_OBJECTS = "Create triangle with constructor with coordinates (enter objects)";
	static final String CREATE_TRIANGLE_CONSTRUCTOR_POINT_NUMBERS = "Create triangle with constructor with coordinates (enter number)";

	public static void main(String[] args) throws Exception {
		System.out.println(CREATE_TRIANGLE_EMPTY_CONSTRUCTOR);
		Triangle triangle1 = new Triangle();
		System.out.println(triangle1.toString());

		System.out.println(CREATE_TRIANGLE_CONSTRUCTOR_SIDES_AND_POINT_OBJECTS);
		Triangle triangle2 = new Triangle(1, 2, 2, new Point(1, 1), new Point(2, 2), new Point(1, 3));
		System.out.println(triangle2.toString());

		System.out.println(CREATE_TRIANGLE_CONSTRUCTOR_SIDES_AND_POINT_NUMBERS);
		Triangle triangle3 = new Triangle(1, 2, 2, 1, 1, 2, 2, 1, 3);
		System.out.println(triangle3.toString());

		System.out.println(CREATE_TRIANGLE_CONSTRUCTOR_SIDES);
		Triangle triangle4 = new Triangle(1, 2, 2);
		System.out.println(triangle4.toString());

		System.out.println(CREATE_TRIANGLE_CONSTRUCTOR_POINT_OBJECTS);
		Triangle triangle5 = new Triangle(new Point(1, 1), new Point(2, 2), new Point(1, 3));
		System.out.println(triangle5.toString());

		System.out.println(CREATE_TRIANGLE_CONSTRUCTOR_POINT_NUMBERS);
		Triangle triangle6 = new Triangle(1, 1, 2, 2, 1, 3);
		System.out.println(triangle6.toString());

		triangle1.setPointA(new Point(1, 2));
	}
}