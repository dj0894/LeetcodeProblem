public class ReverseIntegerByte {

    public static void main(String args[]){
        int a=11;

     int  noOfbits=(int)(Math.log(a)/Math.log(2))+1;
      

      //System.out.println(b1);
         final int INT_BITS = 8;


      //System.out.println(Integer.reverseBytes(a));

     //System.out.println(Integer.toBinaryString(b1>>1));
        System.out.println( a>> 1| a << (INT_BITS - 1));


    }
}
