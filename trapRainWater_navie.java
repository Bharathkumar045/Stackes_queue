package stack_queue;

public class trapRainWater_navie {
  static int trap(int[] arr) {
        int n = arr.length;
        int waterTrapped = 0;
        for (int i = 0; i < n; i++) {
            int j = i;
            int leftMax = 0, rightMax = 0;
            while (j >= 0) {
                leftMax = Math.max(leftMax, arr[j]);
                j--;
            }
            j = i;
            while (j < n) {
                rightMax = Math.max(rightMax, arr[j]);
                j++;
            }
            waterTrapped += Math.min(leftMax, rightMax) - arr[i];
        }
        return waterTrapped;
    }
    public static void main(String args[]) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The duplicate element is " + trap(arr));
    }
}
// Output: The water that can be trapped is 6

// Time Complexity: O(N*N) as for each index we are calculating leftMax and rightMax so it is a nested loop.

// Space Complexity: O(1).



    