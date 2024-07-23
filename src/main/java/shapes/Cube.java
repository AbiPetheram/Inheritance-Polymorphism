package shapes;

public class Cube extends Shape3D{
    double size;
    Rectangle base;

    public Cube(double size) {
        this(new Rectangle(size, size));
        this.size = size;
    }

    private Cube(Rectangle base){
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        return this.size * this.size * this.size;
    }

    @Override
    public Shape getBase() {
        return this.base;
    }
}
