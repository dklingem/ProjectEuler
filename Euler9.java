/**
The Euler9 class implements the solution to Project Euler
problem #9. 

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

 */

class Euler9 {
  public static void main(String[] args) {
    long startTime = System.nanoTime();
    
    boolean found = false;
    int c = 1000;
    int found_c = -1;
    int found_b = -1;
    int found_a = -1;
		while(!found && c > 0)
		{
			for(int b = c - 1; b > 0; b--)
			{
				for(int a = b - 1; a > 0; a--)
				{
					//System.out.println("a: " + a + " b: " + b + " c: " + c);
					//System.out.println("Sqrt of c: " + Math.sqrt(c) + "a^2: " + Math.pow(a,2) +
					//										"b^2: " + Math.pow(b,2));
					if(Math.pow(c,2) == (Math.pow(a,2) + Math.pow(b,2)) && (a + b + c) == 1000)
					{
						found = true;
						found_c = c;
						found_b = b;
						found_a = a;
					}
				}
			}
			c--;
		}
		System.out.println("a = " + found_a);
		System.out.println("b = " + found_b);
		System.out.println("c = " + found_c);
		System.out.println("The product of which is: " + (found_c * found_b * found_a));	
		
    long endTime = System.nanoTime();
		System.out.printf("Total Time: %.6f seconds\n", 
								((endTime - startTime)/1000000000.0));
    }
    

}
