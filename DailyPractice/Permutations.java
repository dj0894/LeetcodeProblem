import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String args[]){
        int[] arr={1,2,3};
        List<List<Integer>> permutations=new ArrayList<List<Integer>>();
        backtracking(permutations,new ArrayList<Integer>(),arr);
        System.out.println(permutations);
    }

    private static void backtracking(List<List<Integer>> permutations, ArrayList<Integer> templist, int[] arr) {
        if(templist.size()==arr.length){
            permutations.add(new ArrayList<>(templist));
        }
        for(int i=0;i<arr.length;i++){
            if(templist.contains(arr[i])){
                continue;
            }
            templist.add(arr[i]);
            backtracking(permutations,templist,arr);
            templist.remove(templist.size()-1);
        }
    }
}
