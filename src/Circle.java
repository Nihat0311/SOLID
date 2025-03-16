public class Circle  implements Shape {
    int r;
    double a=Math.PI;

    public Circle( int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return a*r*r;
    }
}
