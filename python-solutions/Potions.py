n = int(input())
arr = [0] * n

for i in range(n):
    arr[i] = int(input())

arr_sort = sorted(arr)

sum = 0

for j in range (n):
    sum += (arr_sort[j] % 10007) * (arr_sort[n - j - 1] % 10007)

print(sum % 10007)