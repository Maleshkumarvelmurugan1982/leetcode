from collections import Counter
class Solution:
    def frequencySort(self, nums: list[int]) -> list[int]:
        frequency_map = Counter(nums)
        nums.sort(key=lambda x: (frequency_map[x], -x))
        return nums