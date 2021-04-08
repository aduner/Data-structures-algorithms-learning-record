def need(num):
    a=['0','2','4','6','8']
    s=str(num)
    for i in a:
        if i in s:
            return False
    return True

num=2019
while not need(num):
    num+=2019
print(num)