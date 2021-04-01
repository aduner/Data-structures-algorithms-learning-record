# Link: https://leetcode-cn.com/problems/linked-list-cycle/

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    # 哈希表，很简单，但是不符合题干要求，空间复杂度为n
    # def hasCycle(self, head: ListNode) -> bool:
    #     seen = set()
    #     while head:
    #         if head in seen:
    #             return True
    #         seen.add(head)
    #         head = head.next
    #     return False

    # 快慢指针
    def hasCycle(self, head: ListNode) -> bool:
        if not head or not head.next:
            return False
        slow = head
        fast = head.next
        while slow != fast:
            if not fast or not fast.next:
                return False
            slow = slow.next
            fast = fast.next.next
        return True
