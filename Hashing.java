
public class Hashing {
	  public static int[] twoSum(int[] nums, int target) {
	        int ans[]=new int[2];
	        ans[0]=ans[1]=-1;
	       int n=nums.length;
	           for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (nums[i] + nums[j] == target) {
	                    ans[0]=i;
	                    ans[1]=j;
	                    return ans;
	                }
	            }
	        }
	        return ans;

	        
	    }


	public static void main(String[] args) {
		// 
		 int[] arr = {2, 6, 5, 8, 11};
	        int target = 14;
	        int []ans = twoSum(arr, target);
	        System.out.println("This is the answer for variant 2: [" + ans[0]+","+ans[1]+"]");
	    }
	

}
