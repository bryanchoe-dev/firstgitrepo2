public class Circle implements IShape {
    private String type;

    public Circle(String type) {
        this.type = type;
    }

    @Override
    public void Draw() {
        System.out.println("Circle Draw: type=" + type + ", color=" + color);
    }
}
