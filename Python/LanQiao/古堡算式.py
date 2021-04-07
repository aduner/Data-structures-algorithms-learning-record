for num in range(10000,100000):
    s=str(num)
    a=s[0]
    b=s[1]
    c=s[2]
    d=s[3]
    e=s[4]
    for i in range(2,10):
        if int(f"{e}{d}{c}{b}{a}")==num*i and len(set([a,b,c,d,e]))==5:
            print(num)
