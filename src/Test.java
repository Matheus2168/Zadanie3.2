public class Test {

    public static void main(String[] args) {

        ShapeCalculator sc = new ShapeCalculator();

        Square sq = new Square(5);
        System.out.println(sc.squareArea(sq));
        double sqPer = sq.calculatePerimeter();
        System.out.println(sqPer);

        Circle ccl = new Circle(8);
        System.out.println(sc.circleArea(ccl));
        double cc1Per = ccl.calculatePerimeter();
        System.out.println(cc1Per);

        Rectangle rect = new Rectangle(14,9);
        System.out.println(sc.rectPerimeter(rect));
        double rectPer = rect.calculatePerimeter();
        System.out.println(rectPer);

        Triangle tri = new Triangle(2,4,5);
        System.out.println(sc.trianglePerimeter(tri));
        double triPer = tri.calculatePerimeter();
        System.out.println(triPer);





    }
}
