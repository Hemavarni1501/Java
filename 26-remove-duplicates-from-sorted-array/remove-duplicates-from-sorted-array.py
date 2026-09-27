class Solution(object):
    def removeDuplicates(self, nums):
        if not nums:
            return 0
        p=0
        for i in range(1,len(nums)):
            if nums[i]!=nums[p]:
                p+=1
                nums[p]=nums[i]
        del nums[p+1::]
        return p+1
        