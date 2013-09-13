/**
 * The Euler2 class implements the solution to Project Euler
 * problem #2. Each new term in the Fibonacci sequence is generated 
 * by adding the previous two terms. By starting with 1 and 2, the first 10 
 * terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed 
 * four million, find the sum of the even-valued terms.
 */
class Euler2 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        
		int firstNumber = 1;
		int secondNumber = 2;		
		int minorSum = 0;
		int majorSum = secondNumber;
		while(secondNumber <= 4000000)
		{
			minorSum = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = minorSum;
			if (minorSum%2 == 0)
				majorSum += minorSum; 
		}
        System.out.println(majorSum);
        
        long endTime = System.nanoTime();
		System.out.printf("Total Time: %.6f seconds\n", ((endTime - startTime)/1000000000.0));
    }
}
