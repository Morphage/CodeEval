-- CHALLENGE DESCRIPTION:
-- Write a program to determine the sum of the first 1000 prime numbers.

main = print $ sumofprimes

sumofprimes = foldr (+) 0 (take 1000 (primes [2..]))
	
primes (p:[]) = [] 
primes (p:xs) = p : primes [x | x <- xs, x `mod` p > 0]