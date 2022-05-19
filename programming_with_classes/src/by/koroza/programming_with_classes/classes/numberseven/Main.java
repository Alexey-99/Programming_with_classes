/* Описать класс, представляющий треугольник. 
 * Предусмотреть методы для создания объектов, 
 * вычисления площади, периметра и точки пересечения медиан. 
 */

package by.koroza.programming_with_classes.classes.numberseven;

public class Main {

	public static void main(String[] args) throws Exception {
		Triangle triangle6 = new Triangle(); // empty construction
		Triangle triangle1 = new Triangle(1, 2, 2, new Point(1, 1), new Point(2, 2), new Point(1, 3)); // sides and coordinates (objects)
		Triangle triangle2 = new Triangle(1, 2, 2, 1, 1, 2, 2, 1, 3); // sides and coordinates(double)
		Triangle triangle3 = new Triangle(1, 2, 2); // sides
		Triangle triangle4 = new Triangle(new Point(1, 1), new Point(2, 2), new Point(1, 3)); // coordinates (objects)
		Triangle triangle5 = new Triangle(1, 1, 2, 2, 1, 3); // coordinates (double)
		
		triangle1.setPointA(new Point(1, 2));

	}

}
