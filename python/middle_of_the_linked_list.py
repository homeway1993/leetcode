# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def middleNode(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        target = int(self.getDepth(head, 1) / 2)
        return self.getTarget(head, target, 1)

    def getDepth(self, node, count):
        """
        :type node: ListNode
        :type count: int
        :rtype: int
        """
        if node.next == None:
            return count
        
        return self.getDepth(node.next, count + 1)

    def getTarget(self, node, target, current):
        """
        :type node: ListNode
        :type target: int
        :type current: int
        :rtype: ListNode
        """
        if current > target:
            return node

        return self.getTarget(node.next, target, current + 1)
        
      