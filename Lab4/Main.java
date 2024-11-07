package Lab4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.print("# A radius of circle = "+circle.getRadius());
        System.out.printf(" , area = %.2f ",circle.calculateArea());
        System.out.printf(", and perimeter = %.2f . ",circle.calculateCircumference());


        Ractangle ractangle = new Ractangle(4,6);
        System.out.printf("\n# A height and width of ractangle = %.2f , %.2f ",ractangle.getHeight(),ractangle.getWidth());
        System.out.printf(" , area = %.2f ",ractangle.calculateArea());
        System.out.printf(", and perimeter = %.2f . ",ractangle.calculateCircumference());

        Triangle triangle = new Triangle(3,5);
        System.out.printf("\n# A height and base of triangle = %.2f , %.2f ",triangle.getHeight(),triangle.getBase());
        System.out.printf(" , area = %.2f ",triangle.calculateArea());
        System.out.printf(", and perimeter = %.2f . ",triangle.calculateCircumference());
    }
}