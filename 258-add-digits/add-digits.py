class Solution:
    def addDigits(self, num: int) -> int:
        while(num>9):
            s=0
            while(num>0):
                d=num%10
                s=s+d
                num=num//10
            num=s
        return num