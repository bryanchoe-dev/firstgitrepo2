public class Circle implements IShape {
    private String type;

    public Circle(String type) {
        this.type = type;
    }

    @Override
    public void Draw() {
        System.out.println(color + "의 " + type + "을 그립니다");
    }
}
