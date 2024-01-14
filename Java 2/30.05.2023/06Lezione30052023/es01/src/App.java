public class App {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        System.out.println("Circle - Area: " + circle.getArea());
        System.out.println("Circle - Perimeter: " + circle.getPerimeter());
        System.out.println("Circle - Color: " + circle.getColor());

        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        System.out.println("Rectangle - Area: " + rectangle.getArea());
        System.out.println("Rectangle - Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle - Color: " + rectangle.getColor());
    
        Shape[] v = new Shape[4];  //creo vettore di elementi Shape
        v[0] = new Circle("red", 10.0);
        v[1]= new Rectangle("yellow", 10, 40);
    
    }

}
