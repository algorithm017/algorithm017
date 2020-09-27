//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
public class Rotate {

    /**
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        //三次翻转
        //reverse[0,k)
        //reverse[k,length)
        //reverse[0,k]
        int length = nums.length;
        int split = k % length;
        reverse(nums,0,length - split - 1);
        reverse(nums,length - split,length-1);
        reverse(nums,0,length-1);
    }

    public void reverse(int[] nums, int start, int end) {
        if (nums.length < 2){
            return;
        }
        int temp;
        while (start < end) {
            temp = nums[end];
            nums[end--] = nums[start];
            nums[start++] = temp;
        }
    }

 /*   public void rotate_1(int[] nums, int k) {
        // 循环
        int circle = nums.length % k;
        int times = nums.length / k;
        int temp;
        for (int i = 0; i < circle; i++) {
            int tar = i;
            for (int j = 0; j < times; j++) {
                tar += circle;
                temp = nums[i];
                nums[i] = nums[tar];
                nums[i+j*circle] = temp;
            }
        }
    }*/

}
