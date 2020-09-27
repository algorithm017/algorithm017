
class Solution:
    """ 26 Remove Duplicates from Sorted Array """
    def removeDuplicates(self, nums: list[int]) -> int:
        if not nums:
            return 0
        if len(nums) == 1:
            return 1
        previous = nums[0]
        j = 1
        for i in range(1, len(nums)):
            if nums[j] == previous:
                nums.pop(j)
            else:
                previous = nums[j]
                j += 1
        return len(nums)


class Solution:
    """ 189. Rotate Array - solution1"""
    def rotate(self, nums: list[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        for i in range(k):
            n = nums.pop(-1)
            nums.insert(0, n)


class Solution:
    """ 189. Rotate Array - solution2"""
    def rotate(self, nums: list[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums) - k
        nums[:] = nums[n:] + nums[:n]



class ListNode:
    """ Definition for singly-linked list. """
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    """ 21. Merge Two Sorted Lists """
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        output = ListNode(0)
        tail = output
        while l1 and l2:
            if l1.val < l2.val:
                tail.next = l1
                l1 = l1.next
            else:
                tail.next = l2
                l2 = l2.next
            tail = tail.next

        if l1:
            tail.next = l1
        if l2:
            tail.next = l2
        return output.next



class Solution:
    """88. Merge Sorted Array"""
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if not nums1:
            return nums2
        if not nums2:
            return nums1

        n1 = 0
        passed = 0
        while nums2 and passed <= m:
            if nums1[n1] >= nums2[0]:
                nums1.insert(n1, nums2.pop(0))
                nums1.pop(-1)
            else:
                passed += 1
            n1 += 1
        if nums2:
            nums1[(0 - len(nums2)):] = nums2


class Solution:
    """ 1. Two Sum """
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        diff = {}
        for i in range(len(nums)):
            if nums[i] in list(diff.keys()):
                return [diff[nums[i]], i]
            else:
                diff[target-nums[i]] = i


class Solution:
    """ 283. Move zeros """
    def moveZeroes(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        for n in nums[:]:
            if n == 0:
                nums.append(0)
                nums.remove(0)


class Solution:
    """ 66. Plus One """
    def plusOne(self, digits: list[int]) -> list[int]:
        residu = 1
        result = []
        for i in range(len(digits)):
            digit = digits[len(digits) - i - 1]
            if digit == 9 and residu == 1:
                digit = 0
                residu = 1
            else:
                digit += residu
                residu = 0
            result.insert(0, digit)
        if residu == 1:
            result.insert(0, 1)
        return result


"""641. Design Circular Deque"""
"""42. Trapping Rain Water"""
