import java.util.*;

class NegativePositive{
    static void arrangeNumber(int arr[]){
	    int n = arr.length;
		int j=0;
		for(int i=0;i<n;i++){
		    if(arr[i]<0){
			    int temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
		    }
		}
	}
	public static void main(String[] args){
	    int arr[]={-12,11,-13,-5,6,-7,5,-3,-6};
		System.out.println("Origal Array:");
		    System.out.println(Arrays.toString(arr));
			    arrangeNumber(arr);
				System.out.println("Rearranged Array: ");
			    for(int num:arr){
				    System.out.print(num +" ");
				}
	}
		
}
	

