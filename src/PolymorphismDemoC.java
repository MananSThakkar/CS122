

public class PolymorphismDemoC {

    public static void main(String[] args) {

        Circle c = new Circle();
        ColoredCircle d = new ColoredCircle();

        System.out.println("ColoredCircle extends Circle\n");
        System.out.println("Circle c = new Circle();");
        System.out.println("Next is a call to c.draw();");
        c.draw();

        System.out.println("\nColoredCircle d = new ColoredCircle();");
        System.out.println("Next is a call to d.draw();");
        d.draw(); // overrides the draw() inherited from Circle

        System.out.println("\nd is polymorphically assigned to object c");
        System.out.println("c = d;");
        System.out.println("A ColoredCircle \'is a\' Circle.");
        c = d;

        System.out.println("\nThe following is c.draw()");
        System.out.println("Yet the draw() of type d is executed:\n");
        c.draw();
     }
}     
