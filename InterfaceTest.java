public class InterfaceTest {
    public static void main(String[] args) {
        IShape circle = new Circle("원");
        IShape rect = new Rect("사각형");

        circle.Draw();
        rect.Draw();
    }
}
