public class StaticTest {
    static int static_var;

    public StaticTest() {
        static_var++;
    }

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        StaticTest st3 = new StaticTest();
        StaticTest st4 = new StaticTest();

        System.out.println("static_var = " + StaticTest.static_var);
    }
}
