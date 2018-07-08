def fact(n2):
    if n2 == 1:
        return 1
    elif n2== 0:
        return 1
    return fact(n2-1) * n2

n = int(input())

for x in range(n):
    n1 = int(input())
    if n1 < 34:
        print (fact(n1) % 2**32)
    else:
        print(0)
