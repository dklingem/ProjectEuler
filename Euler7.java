/**
The Euler7 class implements the solution to Project Euler
problem #7. 

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10001st prime number?
 */
class Euler7 {
  public static void main(String[] args) {
    long startTime = System.nanoTime();
    
    int number = 0;
    int nthPrime = 0;    
		while(nthPrime <= 10001)
		{
			number++;
			if(isPrime(number))
				nthPrime++;
		}
		
		System.out.println("The " + (nthPrime - 1) + "th Prime number is: " + number);
		
    long endTime = System.nanoTime();
		System.out.printf("Total Time: %.6f seconds\n", 
								((endTime - startTime)/1000000000.0));
    }
    
    public static boolean isPrime(long num)
    {
			int j = 2;
			for(j = 2; j < num; j++)
			{
				if( num%j == 0)
					return false;
			}
			return true;
    }
}
