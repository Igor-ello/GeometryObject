public class Rectangle extends GeometryObject{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        square = a * b;
        return square;
    }

    @Override
    public void scale(double scale) {
        a *= scale;
        b *= scale;
        this.scale = scale;
    }
}
