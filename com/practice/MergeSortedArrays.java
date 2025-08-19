package com.practice;

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;            // pointer for nums1
        int j = n - 1;            // pointer for nums2
        int k = m + n - 1;        // pointer for final position in nums1

        // Merge in reverse order
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If nums2 is not empty, copy remaining elements
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 9 ,8, 2};
        int[] nums2 = {2, 5, 6};
        int m = 6, n = 3;

        merge(nums1, m, nums2, n);

        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
  }
}
