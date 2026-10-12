class Solution:
    def runningSum(self, nums: list[int]) -> list[int]:
        n=[]
        s=0
        for i in nums:
            s=s+i
            n.append(s)
        return n