# The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
#
# Find the sum of all the primes below two million.

# Brute force solution

require 'mathn'

sum = 0
Prime.each(2_000_000) {|i|	sum += i }

puts sum