class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        x=s.strip()
        c=0
        for i in range(len(x)-1,-1,-1):
            if (x[i]==' '):
                break
            c=c+1
        return c