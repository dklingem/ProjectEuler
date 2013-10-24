=begin
The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 55^2 = 3025
Hence the difference between the sum of the squares of the first
ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first 
one hundred natural numbers and the square of the sum.
=end
natural_numbers = 100
sum = 0; sum_of_squares = 0; square_of_sums = 0
(1..natural_numbers).each { |y| sum_of_squares += y**2 }

(1..natural_numbers).each { |x|  sum += x }
square_of_sums = sum**2

difference = (sum_of_squares - square_of_sums).abs
puts difference
