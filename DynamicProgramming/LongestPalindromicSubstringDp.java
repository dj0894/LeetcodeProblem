//https://www.geeksforgeeks.org/longest-palindrome-substring-set-1/
//https://www.youtube.com/watch?v=UflHuQj6MVA

public class LongestPalindromicSubstringDp {
    public static void main(String[] args) {
        String str = "cbbddbb";
        System.out.println(longestPalSubstring(str));

    }

    private static int longestPalSubstring(String str) {
        int n=str.length();
        String output="";
        boolean table[][]=new boolean[n][n];

        //string of length=1 is plaindrom
        int maxLength=1;
        for(int i=0;i<n;i++){
            table[i][i]=true;
        }
        //string of length 2 is plaindrom if s.charAt[i][0]=s.charAt[i][1] for example aa ,bb etc
        int start=0;
        for(int i=0;i<n-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                table[i][i+1]=true;
                start=i;
                maxLength=2;
            }

        }
        // Check for lengths greater than 2.
        // k is length of substring
        for(int k=3;k<=n;k++){

            for(int i=0;i<n-k+1;++i){

               int  endIndex=i+k-1;

               if(table[i+1][endIndex-1]&&str.charAt(i)==str.charAt(endIndex)){
                   table[i][endIndex]=true;

                   if(k>maxLength){
                       start=i;
                       System.out.println(str.substring(i,endIndex+1));
                       maxLength=k;
                   }

               }
            }
        }

   return maxLength;
    }
}
