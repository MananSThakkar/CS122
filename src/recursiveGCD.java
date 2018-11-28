public class recursiveGCD {
    public static void main(String [] args){
 
 int a=27, b=18;

        System.out.println("The GCD of  "
 + a + " and " + b + " is " + gcd(a,b));

    }

    static int gcd (int a, int b)
    {
    int result;
    if (a == 0)
    result = b;
    else
    result = gcd(b % a, a);
    return result;
    }
}
