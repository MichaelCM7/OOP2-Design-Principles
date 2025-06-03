package LiskovSubstitutionPrinciple.Adheres;

public class AreaCalculator {
    public static void calculateArea(Shape shape) {
        System.out.println("Area: " + shape.getArea());
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(5);

        calculateArea(rectangle); // Works correctly
        calculateArea(square);    // Works correctly - substitutable!
    }
}
