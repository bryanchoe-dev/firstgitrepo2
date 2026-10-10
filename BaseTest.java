public class BaseTest {
    public static void main(String[] args) {
        Base[] animals = { new Cat(), new Duck(), new Puppy() };

        for (Base b : animals) {
            b.Start();
            b.Stop();
        }
    }
}
