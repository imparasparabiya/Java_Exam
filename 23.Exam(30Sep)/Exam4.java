public class Exam4 {
    public static void main(String[] args) {
        Display dis = new Display();
        dis.setName("Prince");
        dis.setRoll("999");
        System.out.println("Name = " + dis.getName());
        System.out.println("Roll number = " + dis.getRoll());
    }
}

class Display {
    String roll;
    String name;

    public String getRoll() {
        return this.roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}