public class AreaCalculator implements Visitor{
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        System.out.println("area circle: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getLength() * rectangle.getWidth();
        System.out.println("area rectangle: " + area);
    }

    @Override
    public void visit(Triangle triangle) {
        double area = 0.5 * triangle.getBase() * triangle.getHeight();
        System.out.println("area triangle: " + area);
    }
}
