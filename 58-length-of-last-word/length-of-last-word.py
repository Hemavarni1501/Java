class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        x=s.strip()
        return len(x) if x.rfind(" ")==-1 else len(x)-x.rfind(" ")-1
        