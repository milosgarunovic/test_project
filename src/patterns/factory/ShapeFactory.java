package patterns.factory;

public class ShapeFactory {

    public Shape getShape(ShapeType type) {
//    public static Shape getShape(String type) {
        if (type == null) {
            return null;
        }

        if (type == ShapeType.CIRCLE) {
            return new Circle();
        } else if (type == ShapeType.RECTANGLE) {
            return new Rectangle();
        } else if (type == ShapeType.SQUARE) {
            return new Square();
        }

        return null;
    }

}
