import sys
from math import sqrt

phi_plus = (1 + sqrt(5))/2
phi_minus = (1 - sqrt(5))/2

def fib(n):
	return (phi_plus**n - phi_minus**n)/sqrt(5)

def main():
	print("Hello")
	n = int(input("Enter a Fibonacci number to solve: "))
	print("The ", n," fibonacci number is: ", float(fib(n)))


main()
