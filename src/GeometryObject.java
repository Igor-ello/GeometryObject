public abstract class GeometryObject implements Comparable<GeometryObject>{
    double square; //площадь
    double scale=1; //множитель

    @Override
    public String toString() {
        return  getClass().toString().replace("class ", "") + "{" +
                "square=" + square +
                ", scale=" + scale +
                '}';
    }

    @Override
    public int compareTo(GeometryObject o) {
        if(this.square() > o.square()){
            return 1;
        } else if (this.square() < o.square()){
            return -1;
        }
        return 0;
    }


    public abstract double square();
    public abstract void scale(double scale);
}
