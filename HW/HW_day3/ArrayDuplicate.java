import java.util.*;
class ArrayDuplicate{

public static List<Integer>findDuplicate(int[] arr,int N) {
  int[] freq = new int[N];
  List<Integer> duplicates = new ArrayList<>();
  for(int num : arr) {
   freq[num]++;
   }
   for(int i=0; i<N; i++) {
   if(freq[i] >1) {
   duplicates.add(i);
    }
  }
  return duplicates.isEmpty() ? Collections.singletonList(-1) : duplicates;
   }
   public static void main(String[] args) {
   int[] arr1 = {0, 3, 1, 2};
   int N1=4;
   System.out.println(findDuplicate(arr1, N1));
  int[] arr2 = {2, 3, 1, 2, 3};
   int N2=5;
   System.out.println(findDuplicate(arr2, N2));
   }
}