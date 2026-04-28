class A extends Thread {
    public void run() {
        for(int i=1;i<=10;i++)
            System.out.println("A: "+i);
    }
}

class B extends Thread {
    public void run() {
        for(int i=1;i<=10;i++)
            System.out.println("B: "+i);
    }
}

class C extends Thread {
    public void run() {
        for(int i=1;i<=10;i++)
            System.out.println("C: "+i);
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        A t1=new A();
        B t2=new B();
        C t3=new C();

        t1.start();
        t2.start();
        t3.start();
    }
}