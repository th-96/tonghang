package leetCode;

import java.util.*;

public class testCode {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
    //
    public List<List<String>> groupAnagrams(String[] str) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0;i<str.length;i++){
            char[] chars = str[i].toCharArray();
            Arrays.sort(chars);
            String vlaueStr = new String(chars);
            if(map.containsKey(vlaueStr)){
                map.put(vlaueStr, str[i]);
            }
            else {
                
            }
        }

    }
}
