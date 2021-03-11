//https://leetcode.com/problems/longest-palindromic-substring/
//5. Longest Palindromic Substring


public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String s="ababad";
        if(s==null){
            System.out.println("");
        }

        int start=0;int end=0;

        for (int i=0;i<s.length();i++){

            int len1=expandAroundCenter(s,i,i);
            System.out.println(len1);
            int len2=expandAroundCenter(s,i,i+1);
            System.out.println("**"+len2);
            int len=Math.max(len1,len2);
            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        System.out.println(s.substring(start,end+1));

        }

    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L=left;
        int R=right;
        while(L>=0&&R<s.length()&&s.charAt(L)==s.charAt(R)){
            System.out.println("L->"+s.charAt(L)+" R->"+s.charAt(R));
            L--;
            R++;

        }
        return R-L-1;

    }
}

