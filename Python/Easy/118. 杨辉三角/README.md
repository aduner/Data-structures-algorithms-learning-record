## Pascal's Triangle

https://leetcode-cn.com/problems/pascals-triangle/

`row[n][m]`的值为`row[n-1][m-1]+row[n-1][m]`，知道这一点只需要简单迭代既可以得到结果，可以通过zip的方式去对其然后更方便的迭代

#### 复杂度分析

- 时间复杂度：O(numRows^2)

- 空间复杂度：O(numRows^2)