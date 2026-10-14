class Solution:
    def reverse(self, num: int) -> int:
        min=-2**31
        max=2**31-1
        r=0
        t=abs(num)
        while(t>0):
            d=t%10
            r=r*10+d
            t=t//10
        r=r*-1 if num<0 else r
        return 0 if r<min or r>max else r