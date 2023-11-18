public class Triangle extends GeometryObject{
    private double a;
    private double b;
    private double c;
    private double p;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.p = getP();
    }

    @Override
    public double square() {
        square = Math.sqrt(p*(p- a)*(p- b)*(p- c));
        return square;
    }

    @Override
    public void scale(double scale) {
        a *= scale;
        b *= scale;
        c *= scale;
        p = getP();
        this.scale = scale;
    }

    public double getP() {
        return (a + b + c)/2;
    }
}
