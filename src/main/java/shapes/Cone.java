package shapes;

public class Cone extends Shape3D{
    double height;
    Circle base;

    public Cone(Circle base, double height) {
        this.base = base;
        this.height = height;

    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
