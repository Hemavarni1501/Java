class Solution:
    def reverse(self, x: int) -> int:
        INT_MIN = -(2**31)
        INT_MAX = (2**31) - 1
        r=0
        t=abs(x)
        while(t>0):
            d=t%10
            r=r*10+d
            t=t//10
        return 0 if r<=INT_MIN or r>=INT_MAX else r if x>=0 else -r