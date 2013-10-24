=begin
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
we can see that the 6th prime is 13.

What is the 10,001st prime number?
=end
require 'mathn'
require 'active_support/core_ext/integer/inflections'

max_nth_prime_number = 10_001
number = 0; nth_prime_number = 0; 

until nth_prime_number == max_nth_prime_number do
  number += 1
  if number.prime? then nth_prime_number += 1 end
end

puts "The #{max_nth_prime_number.ordinalize} prime number is #{number}."
