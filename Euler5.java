/**
 * The Euler5 class implements the solution to Project Euler
 * problem #5. 
 * 2520 is the smallest number that can be divided by each of 
 * the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible 
 * by all of the numbers from 1 to 20?
 */
class Euler5 {
  public static void main(String[] args) {
    long startTime = System.nanoTime();
        
    boolean found = false;
    int number = 2520 * 20;    
		while(!found)
		{
			number++;
			for(int i = 20; i > 10; i--)
			{ 
				if(number%i == 0)
					found = true;
				else
				{
					found = false;
					break;
				}
			}
		}
		System.out.println(number);
		
    long endTime = System.nanoTime();
		System.out.printf("Total Time: %.6f seconds\n", 
								((endTime - startTime)/1000000000.0));
    }
    

}
