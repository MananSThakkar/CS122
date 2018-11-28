public class FibonacciDynProg
{
public static void main(String[] args)
{

 long start = System.currentTimeMillis();
 System.out.println("Dynamic Programming");
System.out.println("Time : " + ((start) / 1000));

System.out.println("The first 45 numbers in " +
                      "the Fibonacci series are:\n\n");

   for (int i = 0; i < 100; i++)
   {
   System.out.print ("Fibonacci#" + i  + " ");
   
   System.out.print("-->  " + fibonacci2(i) + "     ");
  
   System.out.println();
   }
 long end = System.currentTimeMillis();
 System.out.println("Time : " + ((end) / 1000));
 System.out.println("Elapsed Time : " + ((end-start)/1000) + " seconds");
 
}
public static int fibonacci2(int n) {
	   int[] table = new int[n + 1];
	   for (int i = 0; i < table.length; i++) {
	      if (i == 0) {
	         table[i] = 0;
	      } else if (i == 1) {
	         table[i] = 1;
	      } else {
	         table[i] = table[i - 2] + table[i - 1];
	      }
	   }

	   return table[n];
	}
	}

