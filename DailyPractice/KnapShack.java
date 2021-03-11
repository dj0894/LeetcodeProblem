import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KnapShack {

    public static void main(String args[]){
        int[] value={60,100,120};
        int[] weight={10,20,30};
        int totalWeight=50;
        int currValue=weight.length;
        int answer = knapsack(value,weight,totalWeight,currValue);
        System.out.println(answer);
    }

    private static int knapsack(int[] value, int[] weight, int currWeight, int curPointer) {

        System.out.println("curWeight : " + currWeight + " curPointer : " + curPointer);
        if (currWeight == 0 || curPointer == 0) {
            if (curPointer == 0) {
                System.out.println("Returning 0 , Pointer 0");
            } else {
                System.out.println("Returning 0 , Weight 0");
            }
            return 0;
        }
        if (weight[curPointer - 1] > currWeight) {
            return knapsack(value, weight, currWeight, curPointer - 1);
        } else {
             int subProblem1 = knapsack(value, weight, currWeight-weight[curPointer-1], curPointer -1);
             int subProblem1_total = value[curPointer - 1] + subProblem1;
             System.out.println("SubProblem 1 Total : " + subProblem1_total);
             int subProblem2 = knapsack(value, weight, currWeight, curPointer -1);
             System.out.println("SubProblem 2 Total : " + subProblem1_total);
             int max = Math.max(subProblem1_total, subProblem2);
             System.out.println("Max : " + max);
             return max;
        }
    }
}

