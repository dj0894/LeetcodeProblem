import java.util.ArrayList;
import java.util.List;

public class CoinChange<ncoins> {
    static int nCoins=0;
    public static void main(String args[]){
        int coins[]={1,2,3,4};

        int sum = 9;

        System.out.println(coinChange(sum,coins, 0, coins.length, new ArrayList<>()));
    }

    public static int coinChange(int sum,int[] coins, int start, int end, List<Integer> curr){
        System.out.println(curr + " " +  sum + " " + " " + start + " "+ end);

        if(sum==0){
           return 1;
        }

        if (start == coins.length) {
            return -1;
        }

        if (sum < 0) {
           return -1;
        }
        int possible = -1;

        for (int i = start; i < end; i++) {
            List<Integer> withCoinList = new ArrayList<>(curr);
            List<Integer> withoutCoinList = new ArrayList<>(curr);
            withCoinList.add(coins[i]);
            int withCoin = coinChange(sum-coins[i], coins, start+1, end, withCoinList);
            int withoutCoin = coinChange(sum, coins, start+1, end, withoutCoinList);
            if (withCoin == 1 || withoutCoin == 1) {
                System.out.println("possible");
                possible = 1;
                break;
            } else {
                return  -1;
            }
        }
        return possible;
    }
}
