import time

def f(n):
	s = 1.0
	d = 2.0
	for i in range(2,n+1):
		s = s + (1.0 / d)
		d = d + 1.0
	return s + 0.0

for i in range(10):
	start = time.clock()
	f(10000000)
	print(time.clock() - start)