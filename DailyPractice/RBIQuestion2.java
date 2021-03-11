import java.util.Arrays;
import java.util.List;

public class RBIQuestion2 {


    public static Integer countCoinsUsingDp(List<Integer> coins, Integer totalCoins, int money) {
        Integer table[] = new Integer[totalCoins+1];
        table[0] = 1;
        for (int i = 0; i < totalCoins; i++) {
            for (int j = coins.get(i); j <= money ; j++) {
                table[j] += table[j-coins.get(i)];
            }
        }
        return table[totalCoins];
    }

    public static int count(List<Integer> coins, Integer m, Integer n) {
        if (n ==0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (m<=0 && n >=1) return 0;

        return count(coins, m-1, n) + count(coins, m, n-coins.get(m-1));
    }

    public static void main(String[] args) {

        int i, j;

        List<Integer> coins = Arrays.asList(new Integer[]{1, 2});

        int result = countCoinsUsingDp(coins, coins.size(), 4);
        System.out.println(result);



    }
}
