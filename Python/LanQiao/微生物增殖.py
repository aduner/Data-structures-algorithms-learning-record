x = 10
y = 90
for t in range(1, 121):
    if t % 6 == 0:
        x *= 2
    if t % 4 == 0:
        y *= 2
    if t % 2 != 0:
        y -= x
print(y)