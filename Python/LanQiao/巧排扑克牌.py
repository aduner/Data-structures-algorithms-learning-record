ls = ["A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"]
result=[]

for i in ls[::-1]:
    result.append(i)
    result.append(result.pop(0))
print(', '.join(reversed(result)))