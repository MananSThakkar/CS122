

public class ShapeDriver1 {

	public static void main(String[] args) {
        Shape1 objEuclid;

        objEuclid = new Two_D_Shape();

        objEuclid.Square();

        Three_D_Shape1 Three_D = new Three_D_Shape1();

        Three_D.Square();

        Three_D.Cube();

        objEuclid =  new Three_D_Shape1();

        objEuclid.Square();
       
       //objEuclid.Cube();  //not OK
        
       ((Three_D_Shape1)objEuclid).Cube();  //OK


	}

}
