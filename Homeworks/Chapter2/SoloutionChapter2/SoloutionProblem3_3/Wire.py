n = int(input())

min1 = max1 = min2 = max2 = 0

for i in range(n):
    a, b = map(int, input().split(' '))
    min1 = min(min1, a - b)
    max1 = max(max1, a - b)
    min2 = min(min2, a + b)
    max2 = max(max2, a + b)

print(max(max1 - min1, max2 - min2))
