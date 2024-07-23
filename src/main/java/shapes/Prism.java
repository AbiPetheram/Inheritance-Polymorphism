package shapes;

public class Prism extends Shape3D{
    double height;
    Shape base;

    public Prism(Shape base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return this.base.calculateArea() * this.height;
    }
}
