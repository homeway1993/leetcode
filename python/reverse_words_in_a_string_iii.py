class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        arr = ''
        for i in s.split(' '):
            arr += self.reverse(i) + ' '
        return arr[:len(arr)-1]

    def reverse(self, s):
        """
        :type s: str
        """
        result = ''
        sLen = len(s)
        for i in range(sLen):
            result += s[sLen - i - 1]
        return result
