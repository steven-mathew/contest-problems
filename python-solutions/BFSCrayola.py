from collections import Counter
n = int(input())
col = input().split()
col_counter = Counter(col)
print(min(n, (n-col_counter.most_common()[0][1])*2+1))

