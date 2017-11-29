public class ShapeCalculator {



    double squareArea(Square square){
        return square.a*square.a;
    }


    double circleArea(Circle cirle){
        return Math.PI*(cirle.r*cirle.r);
    }


    double trianglePerimeter(Triangle triangle){
        return triangle.a+triangle.b+triangle.c;
    }


    double rectPerimeter(Rectangle rectangle){
        return rectangle.a*2+rectangle.b*2;
    }




}
