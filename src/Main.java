public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = new ShapeFactory();

        // Get an object of Rectangle
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        // Get an object of Square
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        // Get an object of RoundedRectangle
        Shape roundedRectangle = shapeFactory.getShape("ROUNDEDRECTANGLE");
       // roundedRectangle.draw();

        // Get an object of RoundedSquare
        Shape roundedSquare = shapeFactory.getShape("ROUNDEDSQUARE");
        roundedSquare.draw();
    }
}
