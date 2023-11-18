import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GeometryObject[] geometryObjects = new GeometryObject[] {
                new Rectangle(1.5, 2.7),
                new Triangle(3.5, 2.7, 3.1),
                new Circle(2.5),
        };
        Arrays.sort(geometryObjects);
        System.out.println(Arrays.toString(geometryObjects));
        geometryObjects[0].scale(3);
        Arrays.sort(geometryObjects);
        System.out.println(Arrays.toString(geometryObjects));
    }
}