import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Chek c = new Chek();
        c.setter();
    }
}

class Chek {
    Scanner scan = new Scanner(System.in);
    int a;

    void setter() {
        System.out.print("Enter Number = ");
        a = scan.nextInt();
        if (a > 0) {
            System.out.println("Number Is Positiv");
        } else if (a == 0) {
            System.out.println("Number Is Zero");
        } else {
            System.out.println("Number Is Negetive");
        }
    }
}