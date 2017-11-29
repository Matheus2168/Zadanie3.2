public class Circle {
    double r;


    Circle(double r){
        this.r = r;
    }


    double calculatePerimeter(){
        return 2*Math.PI*r;
    }
}
