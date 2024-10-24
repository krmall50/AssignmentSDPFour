public class Triangle implements Shape{
    private double height;
    private double base;
    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
