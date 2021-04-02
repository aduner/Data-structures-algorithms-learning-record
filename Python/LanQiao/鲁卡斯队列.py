molecular=1
denominator=3
target=0.618034
while(round(molecular/denominator,6)!=target):
    temp=denominator
    denominator+=molecular
    molecular=temp
print(f"{molecular}/{denominator}")