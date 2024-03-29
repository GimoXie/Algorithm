package io.gimo.algorithm.search;

public class BinarySearch {

    public static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }

    public static int leftBound(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] == target) {
                right = mid - 1;
            }
        }
        if (left >= arr.length || arr[left] != target) {
            return -1;
        }
        return left;
    }

    public static int rightBound(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] == target) {
                left = mid + 1;
            }
            System.out.println("left " + left + " right " + right + " mid " + mid);
        }
        if (right < 0 || arr[right] != target) {
            return -1;
        }
        return right;
    }

}
