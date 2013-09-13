/**
 * The Euler1 class implements the solution to Project Euler
 * problem #1. If we list all the natural numbers below 10 that 
 * are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of 
 * these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
class Euler1 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        
        int sum = 0;
        for( int i = 1; i <1000; i++ )
        {
        	if (i%3==0 || i%5==0)
        		sum += i;
        }
        System.out.println(sum); // Display the string.
        
        long endTime = System.nanoTime();
		System.out.printf("Total Time: %.6f seconds\n", ((endTime - startTime)/1000000000.0));
    }
}
