package DsaSystemDesign.TwoPointer;
import java.util.*;

public class TwoPointer {

    // for this sub pattern array must be sorted.
    // time complexity: O(n)
    // space complexity: O(1) no extra space used.
    // pattern | variation : two pointer apporching to middle.
    public static int[] pairSum(int[] numbers, int target) {// find elements whose sum is equal to target. or Indexes of such elements
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target)
                return new int[] { numbers[left], numbers[right] };
            else if (sum < target)
                left++;
            else
                right--;
        }
        return new int[] { -1, -1 };
    }

    // if 2 sum problem given unsorted array then use this approch not twoPointer as that will un-optimize approch.
    // time complexity : O(n);
    // space complexity : O(n);
    // pattern | variation : Hashing.
    public static int[] pairSumUnsorted(int[] numbers, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer num : numbers) {
            int complement = target - num;
            if (set.contains(complement)) return new int[]{num, complement};
            set.add(num);
        }
        return new int[]{-1,-1};
    }

    // for this sub pattern array must be sorted.
    // time complexity: O(n)
    // space complexity: O(1) no extra space used.
    // pattern | variation : two pointer apporching to middle. all possible pairs
    // equal to target.
    public static ArrayList<ArrayList<Integer>> findAllPairsSum(int[] numbers, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(numbers[left]);
                pair.add(numbers[right]);
                ans.add(pair);
                left++;
                right--;
            } else if (sum < target)
                left++;
            else
                right--;
        }
        return ans;
    }

    // for this sub pattern array must be sorted.
    // time complexity: O(n)
    // space complexity: O(1) no extra space used.
    // pattern | variation : two pointer apporching to middle. all unique pairs
    // equal to target.
    public static ArrayList<ArrayList<Integer>> uniquePairsSum(int[] numbers, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(numbers[left]);
                pair.add(numbers[right]);
                ans.add(pair);
                left++;
                right--;
                // Skip duplicates for left pointer
                while (left < right && numbers[left] == numbers[left - 1])
                    left++;
                // Skip duplicates for right pointer
                while (left < right && numbers[right] == numbers[right + 1])
                    right--;
            } else if (sum < target)
                left++;
            else
                right--;
        }
        return ans;
    }

    // pattern | variation: slow fast pointer / low high pointer.
    // similar to sliding window but different.
    // time complexity: O(n)
    // space complexity: O(1)
    public static void uniqueElements(int[] arr) {// remove the duplicate entries.
        if (arr.length == 0)
            return;
        
        int slow = 0;
        int fast = 1;
        while (fast < arr.length) {
            if (arr[fast - 1] != arr[fast]) {
                arr[++slow] = arr[fast];
            }
            fast++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        System.out.print(Arrays.toString(pairSum(new int[] { 1, 2, 3, 4, 5, 6 }, 7)) + '\n');
        System.out.println(findAllPairsSum(new int[] { 1, 2, 3, 4, 5, 6 }, 7));
        System.out.println(uniquePairsSum(new int[] { -2, -2, -1, -1, -1, -1, 0, 1, 1, 1, 2 }, 0));
        uniqueElements(new int[] { 10, 10, 11, 12, 12, 12, 13, 14 });
    }
}
