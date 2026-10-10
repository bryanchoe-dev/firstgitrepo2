public class Rect implements IShape {
    private String type;

    public Rect(String type) {
        this.type = type;
    }

    @Override
    public void Draw() {
        System.out.println("Rect Draw: type=" + type + ", color=" + color);
    }
}
