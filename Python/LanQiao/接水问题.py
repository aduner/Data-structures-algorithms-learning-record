n,m=(int(i) for i in input().split())
ls=[int(i) for i in input().split()]
run=ls[:m]
wait=list(reversed(ls[m:]))
result=0
while len(run):
    min_time=min(run)
    run=list(map(lambda x:x-min_time,run))
    for index in range(len(run)-1,-1,-1):
        if run[index]:
            continue
        if len(wait):
            run[index]=wait.pop()
        else:
            run.pop(index)
    result+=min_time    

    
print(result)