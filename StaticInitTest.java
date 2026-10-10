public class StaticInitTest {
    static int i = 10;

    public StaticInitTest() {
        System.out.println("Static i=" + i++);
    }

    public static void main(String[] args) {
        System.out.println("Main " + StaticInitTest.i);
    }
}
