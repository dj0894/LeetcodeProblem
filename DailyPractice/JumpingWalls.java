//https://codeforces.com/problemset/problem/198/B

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JumpingWalls {
    public static  void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();

       List<String> wall1=new ArrayList<>();
       List<String> wall2=new ArrayList<>();

       for(int i=0;i<n;i++){
           wall1.add(sc.next());
       }
        for(int i=0;i<n;i++){
            wall2.add(sc.next());
        }

        int position1=0;
        int position2=0;

        System.out.print(checkPath(position1,position2,wall1,wall2, k));


    }

    private static int  checkPath(int position1,int position2, List<String> wall1, List<String> wall2,int k){
        if(wall1.get(position1)=="X"||wall2.get(position2)=="X"){
            return 0;
        }


        position1= checkPath(position1+1,position2, wall1, wall2,k);
        position2 = checkPath(position1, position1+ k, wall1, wall2, k);


       return 1;
    }
}
