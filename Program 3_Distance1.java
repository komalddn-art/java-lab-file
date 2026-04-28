class Distance {

    int meter, cm, mm;

    // Constructor for m, cm, mm
    Distance(int m, int c, int mm) {
        this.meter = m;
        this.cm = c;
        this.mm = mm;
    }

    // Constructor for m, cm only
    Distance(int m, int c) {
        this.meter = m;
        this.cm = c;
        this.mm = 0;
    }

    // Method for adding distance (m, cm, mm)
    void addFull(Distance d1, Distance d2) {
        mm = d1.mm + d2.mm;
        cm = d1.cm + d2.cm + (mm / 10);
        meter = d1.meter + d2.meter + (cm / 100);

        mm = mm % 10;
        cm = cm % 100;
    }

    // Method for adding distance (m, cm only)
    void addSimple(Distance d1, Distance d2) {
        cm = d1.cm + d2.cm;
        meter = d1.meter + d2.meter + (cm / 100);

        cm = cm % 100;
        mm = 0;
    }

    void display() {
        System.out.println("Distance = " + meter + "m " + cm + "cm " + mm + "mm");
    }
}

public class DistanceDemo {
    public static void main(String[] args) {

        // 🔹 Full distance (m, cm, mm)
        Distance d1 = new Distance(2, 50, 7);
        Distance d2 = new Distance(3, 80, 9);
        Distance result1 = new Distance(0, 0, 0);

        result1.addFull(d1, d2);
        System.out.print("Full Distance Addition: ");
        result1.display();

        // 🔹 Simple distance (m, cm)
        Distance d3 = new Distance(4, 60);
        Distance d4 = new Distance(5, 70);
        Distance result2 = new Distance(0, 0);

        result2.addSimple(d3, d4);
        System.out.print("Simple Distance Addition: ");
        result2.display();
    }
}