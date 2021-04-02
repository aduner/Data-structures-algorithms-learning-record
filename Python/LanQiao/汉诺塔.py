
# 递归模拟
sum = 0


def hanota(A, B, C):
    n = len(A)
    move(n, A, B, C)
    print(sum)


def move(n, A, B, C):
    global sum
    sum += 1
    if n == 1:
        C.append(A.pop())
        return
    else:
        move(n-1, A, C, B)
        C.append(A.pop())
        move(n-1, B, A, C)


a = list(range(3))
hanota(a, [], [])

# 数学方式直接算
print(2**64-1)
