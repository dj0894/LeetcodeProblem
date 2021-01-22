import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermuatationsWithoutRepetition {

    public static void main(String arg[]){
     int[] nums={1,2,2};
        List<List<Integer>> permutations=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backtrack(permutations, new ArrayList<>(), nums,new boolean[nums.length]);

        System.out.println(permutations);

    }

    private static void backtrack(List<List<Integer>> permutations, ArrayList<Integer> templist, int[] nums,boolean[] used) {
        if(templist.size()==nums.length){
            permutations.add(new ArrayList<Integer>(templist));
        }else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                    continue;
                }
                used[i]=true;
                templist.add(nums[i]);
                backtrack(permutations, templist, nums, used);
                used[i]=false;
                templist.remove(templist.size() - 1);

            }
        }

    }
}
