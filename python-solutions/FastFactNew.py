def fib(n, visited = {0: 0, 1: 1}):
    if n not in visited:
        visited[n] = fib(n-1, visited) + fib(n-2, visited)
    return visited[n]

n = int(input())
print(fib(n) % 1000000007)