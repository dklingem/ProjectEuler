# A palindromic number reads the same both ways. The largest
# palindrome made from the product of two 2-digit numbers is 
# 9009 = 91 × 99.

# Find the largest palindrome made from the product of two 
# 3-digit numbers.

numbers = Array.new
999.downto(1) do |x|
  999.downto(1) do |y|
    product = x*y
    numbers << product if product.to_s == product.to_s.reverse
  end
end

puts numbers.sort[-1]
