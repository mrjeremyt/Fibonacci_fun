import sys


d = {}

def fib(n):
	if (n == 0): return 0
	elif (n == 1): return 1
	else:
		if n in d:
			return d[n]
		else:
			a = fib(n-1)
			b = fib(n-2)
			d[n-1] = a
			d[n-2] = b
		return a + b

def main():
	print("Hello")
	n = int(input("Enter a Fibonacci number to solve: "))
	print("The ", n," fibonacci number is: ",fib(n))


main()
