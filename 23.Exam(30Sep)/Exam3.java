public class Exam3 {

    public static void main(String[] args) {
        System.out.println("Englen Team Betsman Name");
        System.out.println();
        Batsman b = new Batsman();
        b.get();
        System.out.println();
        System.out.println("Englen Bowler Name");
        System.out.println();
        Bowler c = new Bowler();
        c.show();
    }

}

class CricketPlayer {
    String a = "Eoin Morgan";
    String b = "Joe Root";
    String c = "Jason Roy";
    String d = "Liam Livingstone";
    String e = "Dawid Malan";
    String f = "Adil Rashid";
    String g = "Mark Wood";
    String h = "Jofra Archar";
    String i = "Olly Stone";
    String j = "Reece Topley";
    String k = "Chris Jordan";

}

class Batsman extends CricketPlayer {
    void get() {
        System.out.println("Batsman = " + a);
        System.out.println("Batsman = " + b);
        System.out.println("Batsman = " + c);
        System.out.println("Batsman = " + e);
        System.out.println("Batsman = " + d);
    }
}

class Bowler extends CricketPlayer {
    void show() {
        System.out.println("Bowler = " + f);
        System.out.println("Bowler = " + g);
        System.out.println("Bowler = " + h);
        System.out.println("Bowler = " + i);
        System.out.println("Bowler = " + j);
        System.out.println("Bowler = " + k);
    }
}
