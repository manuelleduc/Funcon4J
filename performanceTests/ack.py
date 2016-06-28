import time, sys
sys.setrecursionlimit(100000)
time.clock()

def ack(x, y):
	if x <= 0:
		return y + 1
	if y <= 0:
		return ack(x - 1, 1)
	return ack(x - 1, ack(x, y - 1))

for i in range(10):
	start = time.clock()
	ack(3, 10)
	print(time.clock() - start)