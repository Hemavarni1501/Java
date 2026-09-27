class Solution(object):
    def isPalindrome(self, x):
        r=0
        t=x
        while(x>0):
            d=x%10
            r=r*10+d
            x/=10
        if(r==t):
            return True
        return False
        