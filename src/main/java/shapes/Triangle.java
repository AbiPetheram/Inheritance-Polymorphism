package shapes;

public class Triangle extends Shape {
   double base;
   double height;


   public Triangle(int base, int height){
       this.base = base;
       this.height =height;

   }
    @Override
    public double calculateArea() {
        double area = (this.base * this.height)/2;
        return area;
    }
}
