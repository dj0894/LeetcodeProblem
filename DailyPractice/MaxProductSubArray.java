//152. Maximum Product Subarray
//https://leetcode.com/problems/maximum-product-subarray/

public class MaxProductSubArray {
        public int maxProduct(int[] nums) {
            int prevMax=nums[0];
            int prevMin=nums[0];
            int ans=prevMax;
            int currMax=0;;
            int currMin=0;

            for(int i=1;i<nums.length;i++){
                currMax=Math.max(nums[i], Math.max(prevMax*nums[i], prevMin*nums[i]));
                currMin=Math.min(nums[i],Math.min(prevMax*nums[i], prevMin*nums[i]));
                ans=Math.max(ans,currMax);
                prevMax=currMax;
                prevMin=currMin;
                System.out.println(currMax+" "+currMin+" "+ans+" "+prevMax+" "+prevMin);
            }

            return ans;

        }
}

