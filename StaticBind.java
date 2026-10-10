public class StaticBind {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Duck duck = new Duck();
        Puppy puppy = new Puppy();

        cat.Start();
        cat.Stop();
        duck.Start();
        duck.Stop();
        puppy.Start();
        puppy.Stop();
    }
}
