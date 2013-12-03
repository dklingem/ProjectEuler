# Work out the first ten digits of the sum of the 
# one-hundred 50-digit numbers in Euler13.txt.

# Create array of 50 numbers by reading each line in Euler13.txt
array = Array.new
File.readlines('Euler13.txt').each { |line| array << line.to_i }

sum = array.inject { |sum, x| sum + x } # Sum the elements of the array
first_ten = sum.to_s[0,10] # Grab the first ten digits

p "The first ten digits are #{first_ten}"