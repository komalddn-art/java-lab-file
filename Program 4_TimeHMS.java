class TimeHMS {
    int h, m, s;

    TimeHMS(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    void add(TimeHMS t1, TimeHMS t2) {
        s = t1.s + t2.s;
        m = t1.m + t2.m + (s / 60);
        h = t1.h + t2.h + (m / 60);

        s = s % 60;
        m = m % 60;
    }

    void display() {
        System.out.println("Time = " + h + ":" + m + ":" + s);
    }

    public static void main(String[] args) {
        TimeHMS t1 = new TimeHMS(2, 45, 50);
        TimeHMS t2 = new TimeHMS(3, 30, 20);

        TimeHMS result = new TimeHMS(0,0,0);
        result.add(t1, t2);
        result.display();
    }
}