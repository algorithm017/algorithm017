import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //使用hash表优化
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i= 0; i<nums.length ;i++){

            if (map.get(target - nums[i]) != null && map.get(target - nums[i])!=i){
                return new int[]{map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }


    /**
     public int[] twoSum(int[] nums, int target) {
     //循环暴力解
     int tar = 0;
     for(int i= 0; i<nums.length ;i++){
     tar = target - nums[i];
     for(int j= 0; j<nums.length ;j++){
     if (j!=i && nums[j] == tar) {
     return new int[]{i,j};
     }
     }
     }
     return new int[]{};
     }


     */
}