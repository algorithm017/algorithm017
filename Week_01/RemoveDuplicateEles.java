/**
 * 26. 删除排序数组中的重复项
 */
public class RemoveDuplicateEles {

    /**
     * 给定一个排序数组，你需要在 原地 删除重复出现的元素，
     * 使得每个元素只出现一次，返回移除后数组的新长度。
     * 不要使用额外的数组空间，你必须在原地修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     */
    public int removeDuplicates(int[] nums) {
        //遍历数组 因为是有序数组 索引重复的数字是相邻的
        //用两个指针进行遍历 一个记录当前需要判断重复的数字 一个记录需要交换的下一个位置
        int s = 1 , t = 1;
        for (;s < nums.length ; s++) {
            if (nums[s] != nums[s-1]) {
                nums[t++] = nums[s];
            }
        }
        return t ;
    }



}
