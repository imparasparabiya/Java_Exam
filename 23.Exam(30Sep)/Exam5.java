import java.util.Scanner;

public class Exam5 {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.calcuate_Shape();

    }

}

class Rectangle {
    Scanner scan = new Scanner(System.in);
    double l;
    double w;

    public void calcuate_Shape() {
        System.out.print("Enter Lenght = ");
        l = scan.nextDouble();
        System.out.print("Ennter Width = ");
        w = scan.nextDouble();
        System.out.println("Rectangle Area = " + (l * w));
    }
}

class Triangle extends Rectangle {
    double b;
    double h;

    public void calcuate_Shape() {
        super.calcuate_Shape();
        System.out.print("Enter Base = ");
        b = scan.nextDouble();
        System.out.print("Ennter Height = ");
        h = scan.nextDouble();
        System.out.println("Rectangle Area = " + (b * h / 2));
    }

}
