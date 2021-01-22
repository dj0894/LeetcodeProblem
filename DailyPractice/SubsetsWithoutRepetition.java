import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/subsets-ii/
//90. Subsets II

public class SubsetsWithoutRepetition {

    public static void main(String args[]){
        int[] nums={1,2,2};
        List<List<Integer>> subsets=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backtracking(subsets,nums,0,new ArrayList<Integer>());
        System.out.println(subsets);
    }

    private static void backtracking(List<List<Integer>> subsets, int[] nums, int start, ArrayList<Integer> subset) {
        subsets.add(new ArrayList<>(subset));
        for(int i=start;i<nums.length;i++){
            if(i>start&&nums[i]==nums[i-1])
                continue;
            subset.add(nums[i]);
            backtracking(subsets,nums,i+1,subset);
            subset.remove(subset.size()-1);
        }
    }

}
