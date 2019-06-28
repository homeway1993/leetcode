import unittest
import reverse_words_in_a_string_iii

class Test(unittest.TestCase):
  def test_1(self):
    s = "Let's take LeetCode contest"
    result = reverse_words_in_a_string_iii.Solution().reverseWords(s)
    self.assertEquals("s'teL ekat edoCteeL tsetnoc", result)

unittest.main(verbosity=2)