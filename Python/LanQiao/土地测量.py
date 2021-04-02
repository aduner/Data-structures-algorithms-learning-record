def area(a,b,c):
    s=sum([a,b,c])/2
    return (s*(s-a)*(s-b)*(s-c))**0.5

AB = 52.1
BC = 57.2
CD = 43.5
DE = 51.9
EA = 33.4
EB = 68.2
EC = 71.9
print(round(area(AB,EA,EB)+area(EC,EB,BC)+area(CD,DE,EC),2))
