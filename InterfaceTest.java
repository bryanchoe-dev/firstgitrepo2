public class InterfaceTest {
    public static void main(String[] args) {
        IShape circle = new Circle("filled");
        IShape rect = new Rect("outline");

        circle.Draw();
        rect.Draw();
    }
}
