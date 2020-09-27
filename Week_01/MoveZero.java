public class MoveZero {

    //给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    public void moveZeroes(int[] nums) {
        //遍历 记录0元素的位置
        //将非0元移动到0 的位置
        if (nums == null || nums.length < 2) return;

        int zero = 0;
        int temp = 0;
        for (int i= 0 ;i< nums.length; i++) {
            if (nums[i] != 0){
                temp = nums[zero];
                nums[zero++] = nums[i];
                nums[i] = temp;
            }

        }
    }
}
