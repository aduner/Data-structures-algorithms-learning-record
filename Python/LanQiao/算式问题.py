num=0
for a in range(123,1001):
    for b in range(a+1,1000-a):
        s=set(f'{a}{b}{a+b}')
        if '0' not in s and len(s)==9:
            print(f"{a} + {b} = {a+b}")
            num+=1
print(num*2)