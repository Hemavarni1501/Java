class Solution(object):
    def isPalindrome(self, x):
        n=str(x)
        r=n[::-1]
        return r==n