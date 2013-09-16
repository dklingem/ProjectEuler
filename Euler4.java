/**
 * The Euler4 class implements the solution to Project Euler
 * problem #4. 
 * A palindromic number reads the same both ways. The largest 
 * palindrome made from the product of two 2-digit numbers is 
 * 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
class Euler4 {
  public static void main(String[] args) {
    long startTime = System.nanoTime();
        
		int numberOfDigits = 3;
		int largestPalindrome = (int)(Math.pow(10,numberOfDigits));
		for (int i = (int)(Math.pow(10,numberOfDigits) - 1);
						 i > (int)(Math.pow(10,numberOfDigits - 1) - 1); i--)
		{
			for (int j = (int)(Math.pow(10,numberOfDigits) - 1); 
							j > (int)(Math.pow(10,numberOfDigits - 1) - 1); j--)
			{
				int number = i * j;
				if( number > largestPalindrome && isPalindrome(number))
					largestPalindrome = number;
			}
		}
		
		System.out.println(largestPalindrome);
		
    long endTime = System.nanoTime();
		System.out.printf("Total Time: %.6f seconds\n", 
								((endTime - startTime)/1000000000.0));
    }
    
    public static boolean isPalindrome(int num)
    {
    	String numString = Integer.toString(num);
    	String reverseNumString = new StringBuilder(numString).reverse().toString();
    	if (numString.compareTo(reverseNumString) == 0)
    		return true;
    	else
    		return false;
    }
}
