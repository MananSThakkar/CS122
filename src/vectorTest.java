import java.util.Vector;
public class vectorTest {
	public static void main(String args[]) {
		Vector<String> v = new Vector<String>(0, 1);
		System.out.println("Initial size: " + v.size());
		System.out.println("Initial capacity: " + v.capacity());
		v.add(new String("One"));
		v.add(new String("Two"));
		v.add(new String("Three"));
		System.out.println("Current size: " + v.size());
		System.out.println("Current capacity: " + v.capacity());
		
		for (String value : v) {
            System.out.println(value);
        }
		}
}
