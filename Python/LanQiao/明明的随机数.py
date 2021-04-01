def quick_sort(ls):
    if len(ls) < 2:
        return ls
    else:
        pivot =ls[0]
        less = [i for i in ls[1:] if i <= pivot]
        greater = [i for i in ls[1:] if i > pivot]
    return quick_sort(less) + [pivot] + quick_sort(greater)


num=int(input())
ls=[str(i) for i in quick_sort([int(i) for i in list(set(input().split()))])]
print(len(ls))
print(' '.join(ls))

