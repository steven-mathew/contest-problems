n = int(input())
coefficients = []
for i in range(n+1):
    coefficients.append(float(input()))

first = coefficients[0]
last = coefficients[-1]

ans = (abs(float(last)/first))**(float(1)/n)
if n%2:
    if last * first > 0:
        ans=-ans
else:
    if coefficients[-2]*last > 0:
        ans=-ans

k='%.6f'%ans
print(k)