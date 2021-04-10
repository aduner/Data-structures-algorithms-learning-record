class Solution:
    def validateStackSequences(self, pushed, popped):
        temp=[]
        popped=[i for i in popped[::-1]]
        for i in pushed:
            temp.append(i)
            while temp and temp[-1]==popped[-1]:
                temp.pop()
                popped.pop()
        if temp and popped:
            return False    
        else:
            return True