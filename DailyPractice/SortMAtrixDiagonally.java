//1329. Sort the Matrix Diagonally
//https://leetcode.com/problems/sort-the-matrix-diagonally


import java.util.*;

public class SortMAtrixDiagonally {
    public static void main(String args[]){
        int mat[][]=new int[][]{{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        int m=mat.length;
        int n=mat[0].length;
        Map<Integer, Queue<Integer>> map=new HashMap<>();
        System.out.println(Arrays.deepToString(mat));

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                map.putIfAbsent(i-j,new PriorityQueue<Integer>());
                map.get(i-j).add(mat[i][j]);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=map.get(i-j).remove();
            }
        }

        System.out.println(Arrays.deepToString(mat));
    }
}
