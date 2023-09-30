public class Exam6 {
    public static void main(String[] args) {
        Array array = new Array();
        array.arrayPrint();
    }
}

class Array {
    int abc[] = { 10, 20, 30, 50, 40, 60, 202 };

    int max = abc[0];
    int min = abc[0];
    int i;

    void arrayPrint() {
        for (int i = 0; i < abc.length; i++) {
            if (abc[i] > max) {
                max = abc[i];
            }
            if (abc[i] < min) {
                min = abc[i];
            }
        }
        System.out.println("Maximun Value is : " + max);
        System.out.println("Minimum Value Is : " + min);
    }
}
