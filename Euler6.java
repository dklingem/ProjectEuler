/**
The Euler6 class implements the solution to Project Euler
problem #6. 
The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten 
natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one 
hundred natural numbers and the square of the sum.

 */
class Euler6 {
  public static void main(String[] args) {
    long startTime = System.nanoTime();
        
		int numOfNumbers = 100;
		int sumOfSquares = 0;
		for(int i = 1; i <=numOfNumbers; i++)
		{
			sumOfSquares += Math.pow(i,2);
		}
		
		int sum = 0;
		for(int i = 1; i <= numOfNumbers; i++)
		{
			sum += i;  
		}
		int squareOfSums = (int)(Math.pow(sum,2));
		
		System.out.println("Sum of squares is: " + sumOfSquares);
		System.out.println("Square of sums is: " + squareOfSums);
		System.out.println("The difference is: " + (squareOfSums - sumOfSquares));
		
    long endTime = System.nanoTime();
		System.out.printf("Total Time: %.6f seconds\n", 
								((endTime - startTime)/1000000000.0));
    }
    

}
