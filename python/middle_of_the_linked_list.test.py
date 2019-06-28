import unittest
from middle_of_the_linked_list import Solution, ListNode

class Test(unittest.TestCase):
    def test(self):
        node1 = ListNode(2)
        node2 = ListNode(3)
        node3 = ListNode(4)
        node4 = ListNode(5)

        node1.next = node2
        node2.next = node3
        node3.next = node4

        result = Solution().middleNode(node1)
        self.assertEquals(4, result.val)

unittest.main(verbosity=2)