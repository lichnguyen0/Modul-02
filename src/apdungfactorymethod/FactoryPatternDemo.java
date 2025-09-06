package apdungfactorymethod;

public class FactoryPatternDemo {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        //tao doi tuong Circle va goi phuong thuc draw
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //tao hinh Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        //tao hinh Square
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
