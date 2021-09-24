package shapes;

public class Cylinder extends Shape{

    private double height;
    private double radius;

    public Cylinder(){

    }
    public Cylinder( double x){

    }
    public double getHeight(){
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double surfaceArea(){

        return 0;
    }
    public String toString(){

    }
    public double volume(){
        return 0;
    }

    @Override
    public double surfaceArea() {
        return 0.0;
    }

    @Override
    public void volume() {
        return 0;
    }
}

