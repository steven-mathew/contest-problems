from math import log

n = input()
out = 1

for i in range(1,1000000):
    out += log(i,10)

    if int(out) == len(n):
        break

if i > 10:
    print(i)
else:
    n = int(n)
    out = 0
    fact = 1

    while n > 1:
        n /= fact
        out += 1
        fact += 1

    if out == 0:
        out = 1

    print(out)