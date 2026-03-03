package DsaSystemDesign.SlidingWindow;
import java.util.*;

public class MaxSubSumK {
    
    public static int maxSubArraySumOfKSizeWindow(int[] nums, int k) {
        int low = 0, high = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        while (high < nums.length) {
            sum += nums[high];
                 
            if (high - low + 1 == k) {
                maxSum = Math.max(maxSum, sum);

                // remove nums[low] and move low to slide window
                sum -= nums[low];
                low++;
            }
            high++;
        }

        return maxSum;
    }

    public static ArrayList<ArrayList<Integer>> windowsMatchedSum(int[] nums, int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int low = 0, high = 0;
        int currentSum = 0;
        while (high < nums.length) {
            currentSum += nums[high];
            if (currentSum >= sum) {
                
                if (currentSum == sum) {
                    ArrayList<Integer> list = new ArrayList<>();
                    while (low < high) {
                        currentSum -= nums[low];
                        list.add(nums[low]);
                        low++;
                    }
                    ans.add(list);
                } else {
                    while (currentSum > sum) {
                        currentSum -= nums[low++];
                    }
                }

            } else {

            }
            high++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 3, 5, 2, 1, 4};
        int[] nums2 = {1, 0, 2, 3, -7, 10, 1, 1, 1};
        int ans = maxSubArraySumOfKSizeWindow(nums, 3);
        System.out.println(ans);
        System.out.println(windowsMatchedSum(nums, 3));
    }
}