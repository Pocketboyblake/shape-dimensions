package shapes;

public class Cube extends Shape{

    private double width;

    public Cube(double x){

        width = x;
    }

        public double getWidth() {
            return 6 * width;
        }

        public void setWidth(){
            this.width = width;

        }
        public double surfaceArea(){

            return 0;
        }
        public String toString(){

        }
        public double Volume(){
            return surfaceArea()* width;

        }


}
