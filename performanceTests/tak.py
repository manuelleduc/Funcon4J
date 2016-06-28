import time
time.clock()

def tak(x,y,z):
	if y >= x:
		return z
	else:
		return tak(tak(x - 1.0, y, z), tak(y - 1.0, z, x), tak(z - 1.0, x, y))

n = 9.0

for i in range(10):
	start = time.clock()
	tak(n * 3.0, n * 2.0, n * 1.0))
	print(time.clock() - start)