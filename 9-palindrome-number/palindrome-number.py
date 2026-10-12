class Solution:
    def isPalindrome(self, x: int) -> bool:
        t=str(x)
        r=t[::-1]
        return t==r
        ''' r=0
        t=x
        while(x>0):
            d=x%10
            r=r*10+d
            x=x//10
        return r==t'''
        