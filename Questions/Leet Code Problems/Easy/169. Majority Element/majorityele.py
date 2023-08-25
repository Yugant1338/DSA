class Solution(object):
    def majorityElement(self, nums):
        newlist = list(set(nums))
        majority = 0
        for i in range(0, len(newlist)):
            if(nums.count(newlist[i]) > len(nums)/2 and majority < nums.count(newlist[i])):
                num = newlist[i]
        return num
