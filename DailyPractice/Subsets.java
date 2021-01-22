import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/subsets/
//78. Subsets: finding all subsets
public class Subsets {


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backtrack(nums, subsets, 0, new ArrayList<>());
        return subsets;
    }

    private void backtrack(int[] nums, List<List<Integer>> list, int start, ArrayList<Integer> subset) {
        list.add(new ArrayList<Integer>(subset));
        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            backtrack(nums, list, i + 1, subset);
            subset.remove(subset.size() - 1);
        }

    }
}