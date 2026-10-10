public class Chap11DoIt {
    public static void main(String[] args) {
        SayHello[] hellos = { new SayHelloEng(), new SayHelloKo() };

        for (SayHello hello : hellos) {
            hello.print();
        }
    }
}
