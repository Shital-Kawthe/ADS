/*Problem 1: 
Given an array of integers, perform the following operations: 
1. Find the second largest element in the array. 
2. Move all zeros to the end of the array while maintaining the order of non-zero 
elements. 
Input: 
arr = [10, 0, 5, 20, 0, 8, 15]*/

class ArrayOperations {
    public static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }
        return second == Integer.MIN_VALUE ? -1 : second;
    }

    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 0, 5, 20, 0, 8, 15};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest element: " + secondLargest);
        
        moveZerosToEnd(arr);
        System.out.print("Array after moving zeros: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}