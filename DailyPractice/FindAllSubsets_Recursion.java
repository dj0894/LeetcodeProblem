import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Finding subset using Recursion or Backtracking

public class FindAllSubsets_Recursion {
    static int[] nums= {1, 2, 3};

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(list, new ArrayList<>(),nums,0);
        System.out.println(list);

    }
    
    private static void backTrack(List<List<Integer>> list, ArrayList<Integer>  subset, int[] nums, int start) {
        list.add(new ArrayList<>(subset));
        for(int i=start;i<nums.length;i++){
            subset.add(nums[i]);
            backTrack(list,subset,nums,i+1);
            subset.remove(subset.size()-1);
        }
    }
}

