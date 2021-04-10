    class Solution:
        def spiralOrder(self, matrix):
            if not matrix:
                return matrix
            left, right, top, bottom, result = 0, len(matrix[0]) - 1, 0, len(matrix) - 1, []
            while True:
                for i in range(left, right + 1):
                    result.append(matrix[top][i])  # left to right
                top += 1
                if top > bottom:
                    break
                for i in range(top, bottom + 1):
                    result.append(matrix[i][right])  # top to bottom
                right -= 1
                if left > right:
                    break
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])  # right to left
                bottom -= 1
                if top > bottom:
                    break
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])  # bottom to top
                left += 1
                if left > right:
                    break
            return result

class Solution2:
    def spiralOrder(self, matrix):
        res = []
        while matrix:
            res += matrix.pop(0)
            matrix = list(zip(*matrix))[::-1]
        return res

Solution().spiralOrder([[1,2,3],[4,5,6],[7,8,9]])