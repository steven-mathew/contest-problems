
n = int(input()) # columns
m = int(input()) # rows
print(n,m)
matrix = []
for i in range(0,m):
    matrix.append([])
    for j in range(0,n):
        matrix[i].append(0)
        matrix[i][j] = input()
print(matrix)



