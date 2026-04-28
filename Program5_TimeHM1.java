class TimeHM {
    int h, m;

    TimeHM(int h, int m) {
        this.h = h;
        this.m = m;
    }

    void add(TimeHM t1, TimeHM t2) {
        m = t1.m + t2.m;
        h = t1.h + t2.h + (m / 60);
        m = m % 60;
    }

    void display() {
        System.out.println("Time = " + h + ":" + m);
    }

    public static void main(String[] args) {
        TimeHM t1 = new TimeHM(2, 50);
        TimeHM t2 = new TimeHM(3, 30);

        TimeHM result = new TimeHM(0,0);
        result.add(t1, t2);
        result.display();
    }
}