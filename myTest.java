public class myTest extends My {
    @Override
    public void disp() {
        System.out.println("Yes, I overrided.");
    }

    public static void main(String[] args) {
        myTest t = new myTest();
        t.prn();
        t.disp();
    }
}
