s = list(map(int,input().split()))
t = 0

for i in range(5):
    if i == 0:
        t += s[i] * 5
    if i == 1:
        t += s[i] * 10
    if i == 2:
        t += s[i] * 25
    if i == 3:
        t += s[i] * 100
    if i == 4:
        t += s[i] * 200

print(t)
