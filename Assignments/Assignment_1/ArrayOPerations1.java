/*Problem 3: 
Given a sorted array of integers (which may include duplicates), perform the following 
operations: 
1. Search for a given key and return its index (if found) with Binary Search. 
2. Find the first and last occurrence of the key in the array. 
3. Count the total number of times the key appears. 
4. Find any peak element in the array (an element greater than its neighbors). 
Input: 
arr = [1, 3, 3, 3, 5, 6, 8], key = 3 
Input for Peak Element: 
arr =[1, 2, 18, 4, 5, 0]*/

import java.util.Arrays;
 public class ArrayOPerations1 {
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static int firstOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                result = mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
     public static int lastOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                result = mid;
                left = mid + 1; 
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
	 }
    public static int countOccurrences(int[] arr, int key) {
        int first = firstOccurrence(arr, key);
        if (first == -1) return 0; 
        int last = lastOccurrence(arr, key);
        return last - first + 1;
    }
    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean leftCheck = (i == 0 || arr[i] > arr[i - 1]);
            boolean rightCheck = (i == n - 1 || arr[i] > arr[i + 1]);
            if (leftCheck && rightCheck) {
                return arr[i];
            }
        }
        return -1; 
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 5, 6, 8};
        int key = 3;
        
        int searchIndex = binarySearch(arr, key);
        int firstIndex = firstOccurrence(arr, key);
        int lastIndex = lastOccurrence(arr, key);
        int count = countOccurrences(arr, key);
        
        System.out.println("Key found at index: " + searchIndex);
        System.out.println("First occurrence: " + firstIndex);
        System.out.println("Last occurrence: " + lastIndex);
        System.out.println("Total count of key: " + count);
        
        int[] peakArr = {1, 2, 18, 4, 5, 0};
        int peakElement = findPeakElement(peakArr);
        System.out.println("Peak element: " + peakElement);
    }
}
