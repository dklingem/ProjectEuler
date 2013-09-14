/**
 * The Euler3 class implements the solution to Project Euler
 * problem #3. 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 */
class Euler3 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        
		long number = 600851475143L;
		
		for(int i = 2; i < number; i++)
		{
			if (!isPrime(number))
			{
				if (isPrime(i))
				{
					if (number%i == 0)
						number = number / i;
				}
			}
		}
		
		
		System.out.println(number + " is the largest prime factorial");
		
        long endTime = System.nanoTime();
		System.out.printf("Total Time: %.6f seconds\n", ((endTime - startTime)/1000000000.0));
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
