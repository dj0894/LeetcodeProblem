public class Recursion {


    public static int factorial(int n) {
        if(n<=1){
            return 1;
        }

        return factorial(n-1)*n;


    }

    //0,1,1,2,3,5,8,13....
    public  static int fibonacci(int n){
        if(n==1){
            return 0;
        }
        if(n==2||n==3){
            return 1;
        }

        int previous = fibonacci(n-1);
        int super_previous = fibonacci(n-2);
        return super_previous + previous;

    }

    public static int fibonacci2(int n){

        int output=0;
        if(n==1){
            return 0;
        }
        if(n==2||n==3){
            return 1;
        }
        int first=1;
        int second=1;
        for(int i=4;i<=n;i++){
            output=first+second;
            first=second;
            second=output;
        }
      return  output;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci2(6));
    }
}
