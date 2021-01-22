import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KnapShack {

    public static void main(String args[]){
        int[] value={60,100,100,30};
        int[] weight={1,30,40};
        int totalWeight=30;
        int wightSum=0;
        int currValue=weight.length;
        int answer = knapsack(value,weight,totalWeight,currValue);
        System.out.println(answer);
    }

    private static int knapsack(int[] value, int[] weight, int totalWeight, int curPointer) {

        if (totalWeight == 0 || curPointer == 0) {
            return 0;
        }
        if (weight[curPointer - 1] > totalWeight) {
            return knapsack(value, weight, totalWeight, curPointer - 1);
        } else {
            return Math.max(value[curPointer - 1] + knapsack(value, weight, totalWeight-weight[curPointer-1],
                    curPointer -1), knapsack(value, weight, totalWeight, curPointer -1));
        }
    }
}

