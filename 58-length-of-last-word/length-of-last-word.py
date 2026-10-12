class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        x=s.strip()
        n=x.count(" ")
        return len(x) if n==0 else len(x)-x.rindex(" ")-1
        