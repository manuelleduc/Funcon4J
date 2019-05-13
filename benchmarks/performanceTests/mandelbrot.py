import time
start = time.clock()

def dbl(f):
  return 2.0 * f

for y in range(401):
  print()
  for x in range(401):
    cr = dbl(x * 1.0) / 400.0 - 1.5
    ci = dbl(y * 1.0) / 400.0 - 1.0
    i = 1000
    zr = 0.0
    zi = 0.0
    zr2 = 0.0
    zi2 = 0.0
    while True:
      if i == 0:
        print(1, end = "")
        break
      else:
        tr = zr2 - zi2 + cr
        ti = dbl(zr) * zi + ci
        zr = tr
        zi = ti
        zr2 = zr * zr
        zi2 = zi * zi
        if zr2 + zi2 > 2.0 * 2.0:
          print(0, end = "")
          break
      i = i - 1

print(time.clock())