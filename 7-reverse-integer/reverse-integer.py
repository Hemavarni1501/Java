class Solution:
    def reverse(self, x: int) -> int:
       r=int(str(abs(x))[::-1])
       if x<0:
        r=r*-1
       if r<-(2**31) or r > 2**31 - 1:
        return 0
       return r







       