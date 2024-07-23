package shapes;

public class Cube extends Shape3D{
    int size;
    Rectangle base;

    public Cube(int size) {
        this.size = size;
    }

    private Cube(Rectangle base){
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
