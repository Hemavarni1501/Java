class Solution:
    def isPalindrome(self, x: int) -> bool:
        t=str(x)
        r=t[::-1]
        return t==r