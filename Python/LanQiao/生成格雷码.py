import os
import sys

n,k = map(int,input().split())

def create(n,k,nums=''):
    ls_len = 2**(n-1)
    if k > ls_len-1:
        nums += '1'
        k = ls_len*2-1-k # 如果k在右半边需要转换到左半边
    else:
        nums += '0'
    n -= 1
    if n == 0:
        return nums
    else:
        return create(n,k,nums) # 降到下一纬，继续判断添加0，1
print(create(n,k))


    