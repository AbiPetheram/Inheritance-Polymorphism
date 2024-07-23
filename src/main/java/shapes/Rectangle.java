package shapes;

public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }


    @Override
    public double calculateArea() {
        double area = this.length * this.width;
        return area;
    }
}
