public class FibonacciRecursive
{
public static void main(String[] args)
{

 long start = System.currentTimeMillis();
 System.out.println("Recursive");
 System.out.println("Time : " + ((start) / 1000));

 System.out.println("The first 50 numbers in " +
                      "the Fibonacci series are:\n\n");

   for (int i = 0; i < 51; i++)
   {
   System.out.print ("Fibonacci#" + i  + " ");
   
   System.out.print("-->  " + fib(i) + "     ");
   
   System.out.println();
   System.out.println("Seconds : " + ((System.currentTimeMillis()) / 1000));
   System.out.println();
   }
 long end = System.currentTimeMillis();
 System.out.println("Time : " + ((end) / 1000));
 System.out.println("Elapsed Time : " + ((end-start)/1000) + " seconds");
}

public static double fib(double n)
{
	if (n == 0)  return 0;
	if (n == 1)  return 1;
	else
		return fib(n-1) + fib(n-2);
}
}
