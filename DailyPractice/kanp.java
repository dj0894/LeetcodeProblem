import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class kanp {
    public static void main(String args[]){
        int[] value={60,100,100,30};
        int[] weight={10,20,30,40};
        int totalWeight=30;
        int wightSum=0;
        int currValue=0;

        Map<List<Integer>,Integer> combination=new HashMap<>();
        backtrack(combination,value,weight,totalWeight,new ArrayList<>(),0,wightSum,currValue);
        System.out.println(combination);

    }

    private static void backtrack(Map<List<Integer>,Integer> combination, int[] value, int[] weight, int totalWeight, ArrayList<Integer> subset, int start,int wightSum,int currValue) {

        if(wightSum==totalWeight) {

            combination.put(new ArrayList<>(subset),wightSum);
        }

        for(int i=start;i<weight.length;i++){
            wightSum=wightSum+weight[i];
            if(wightSum>totalWeight){
                continue;
            }
            subset.add(weight[i]);
            backtrack(combination,value,weight,totalWeight,subset,i+1,wightSum,currValue);
            wightSum=wightSum-subset.get(subset.size()-1);
            subset.remove(subset.size()-1);


        }
    }
}
