class Distance {

    int meter, cm, mm;

    Distance(int m, int c, int mm) {
        this.meter = m;
        this.cm = c;
        this.mm = mm;
    }

    void add(Distance d1, Distance d2) {

        mm = d1.mm + d2.mm;
        cm = d1.cm + d2.cm + (mm / 10);
        meter = d1.meter + d2.meter + (cm / 100);

        mm = mm % 10;
        cm = cm % 100;
    }

    void display() {
        System.out.println("Distance = " + meter + "m " + cm + "cm " + mm + "mm");
    }
}