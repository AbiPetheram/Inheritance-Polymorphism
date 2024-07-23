package shapes;

public class Circle extends Shape{
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = 3.14 * (this.radius * this.radius);
        return area;
    }
}
