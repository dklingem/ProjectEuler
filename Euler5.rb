# NOT COMPLETED!!!
# 2520 is the smallest number that can be divided by each 
# of the numbers from 1 to 10 without any remainder.

# What is the smallest positive number that is evenly 
# divisible by all of the numbers from 1 to 20?

number = 10
numbers = (1..number).to_a

number += 1 until number%10 == 0 && number%9 == 0 && number%8 == 0 && number%7 == 0 && number%6 == 0 

puts number

def EvenlyDivisiblyBy (number, divisibly_by)
  
end
