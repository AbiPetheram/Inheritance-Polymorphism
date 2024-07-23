package shapes;

public class Cube extends Shape3D{
    int size;

    public Cube(int size) {
        this.size = size;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
