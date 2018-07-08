# d = input().split()
# sum = 0
#
# for i in d:
#     sum += int(i)
#
# print(sum)

# q = int(input())
# input()
# d = sorted(map(int, input().split()))
# p = sorted(map(int, input().split()))
#
# if q == 2:
#     p.reverse()
#
# print(sum(max(x,y) for x,y in zip(d,p)))

def main():
    n = int(input('Find the next prime number greater great than: '))
    print(find_next_prime(n+1))

def find_next_prime(n):
    return find_prime_in_range(n, 2*n)

def find_prime_in_range(a, b):
    for p in range(a, b):
        for i in range(2, p):
            if p % i == 0:
                break
        else:
            return p
    return None

if __name__ == '__main__':
    main()