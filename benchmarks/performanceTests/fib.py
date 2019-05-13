import time

def fib(n):
	if n < 2:
		return 1;
	else:
		return fib(n - 1) + fib(n - 2)

def loop(n):
	for i in range(0, n + 1):
		print(fib(30))

for i in range(10):
	start = time.clock()
	loop(100)
	print(time.clock() - start)