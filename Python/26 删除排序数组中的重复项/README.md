## Remove Duplicates from Sorted Array

Link: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/

#### 方法1：

循环去除的方式，因为题目要求原地修改，所以要用`nums[:]`而不是`nums`

#### 方法2：

借助`set`

还是因为题目要求原地修改，所以要用`nums[:]`而不是`nums`

`nums`为浅拷贝，`nums[:]`相当于深拷贝