public class InterfaceTest {
    public static void main(String[] args) {
        IShape[] shapes = { new Circle("원"), new Rect("사각형") };

        for (IShape shape : shapes) {
            shape.Draw();
        }
    }
}
