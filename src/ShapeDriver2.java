

public class ShapeDriver2 {
    public static void main(String [] args)
    {

    Shape1 obj1 = new Three_D_Shape2();
    Shape2 obj2 = new Three_D_Shape2();
    Shape3 obj3 = new Three_D_Shape2();

    obj1.Circle();
    obj2.Oval();
    obj3.Rhombus();
    
    System.out.print("\n\nobj1.Oval() allowed by Shape2 cast: ");
    ((Shape2)obj1).Oval();
    System.out.print("\nobj1.Rhombus() allowed by Shape3 cast: ");
    ((Shape3)obj1).Rhombus();

    }
}

