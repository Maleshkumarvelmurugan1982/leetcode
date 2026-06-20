class Solution:
    def concatWithReverse(self, nums: list[int]) -> list[int]:
        reverse = list(reversed(nums))
        return nums+reverse
        
        