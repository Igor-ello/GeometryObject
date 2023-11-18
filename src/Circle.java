public class Circle extends GeometryObject{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        square = Math.PI * radius * radius;
        return square;
    }

    @Override
    public void scale(double scale) {
        radius *= scale;
        this.scale = scale;
    }

}
