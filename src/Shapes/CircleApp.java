package Shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        String prompt = "Enter the radius of your circle in inches:";
//        System.out.println(prompt);
        Input input = new Input();
//        System.out.println(input);
        double radius = input.getDouble(prompt);
        Circle circle = new Circle(radius);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.printf("The area of your circle is %.2f square inches and the circumference is %.2f inches %n", area, circumference);
    }
}
