package DsaSystemDesign.SlidingWindow;
import java.util.*;

public class AdityaVermaSlidingWindow {
    
    public static int maxSubArraySumOfKSizeWindow(int[] nums, int k) {
        int low = 0, high = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        while (high < nums.length) {
            sum += nums[high];
            if (high - low + 1 < k) {
                high++;
            }
            else if (high - low + 1 == k) {
                maxSum = Math.max(maxSum, sum);

                // remove nums[low] and move low to slide window
                sum -= nums[low];
                low++;
                high++;
            }
        }

        return maxSum;
    }
    // GFG : https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
    public static ArrayList<Integer> firstNegNumForKSizeWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int low = 0;
        int high = 0;
        while (high < nums.length) {
            if (high - low + 1 < k) {
                if (nums[high] < 0) {
                    q.add(nums[high]);
                }
                high++;
            } else if (high - low + 1 == k) {
                if (nums[high] < 0) {
                    q.add(nums[high]);
                }
                if (q.size() > 0) {
                    list.add(q.peek());
                } else {
                    list.add(0); 
                }
                if (nums[low] < 0) {
                    q.poll();
                }
                high++;
                low++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 3, 5, 2, 1, 4};
        int[] nums2 = {1, 0, 2, 3, -7, 10, 1, 1, 1};
        System.out.println(maxSubArraySumOfKSizeWindow(nums, 3));
        System.out.println(firstNegNumForKSizeWindow(nums2, 3));
    }
}