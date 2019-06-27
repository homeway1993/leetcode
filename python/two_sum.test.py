import unittest
import two_sum

class TwoSumTest(unittest.TestCase):
  def test_1(self):
    nums = [2, 7, 11, 15]
    target = 9
    result = two_sum.Solution().twoSum(nums, target)
    self.assertEquals([0, 1], result)


unittest.main(verbosity=2)