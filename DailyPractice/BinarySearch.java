import java.util.Arrays;

public class BinarySearch {
    public static void  main(String args[]){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int find=1;
        Arrays.sort(arr);
       int start=0;
       int end=arr.length-1;

       while(start>=0&&end<=arr.length-1){
          int mid=(start+end)/2;
           System.out.println(start+" "+end+" "+mid);
           if(arr[mid]==find){
               System.out.println(find +"is present at "+mid +"location");
               break;

           }else{
               if(find>arr[mid]){
                   start=mid+1;
                   end=end;
               }else{
                   end=mid-1;
                   start=start;
               }
           }


       }





    }
}
