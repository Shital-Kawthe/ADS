//recursive program to fmd sum of series

import java.util.Scanner;
class SumOfSeriesRecursion {
    static double sum(int n){
	    if(n==1){
		    return 1.0;
		}
		if ( n % 2 == 0){
		    return sum(n-1)-(1.0/n);
		}
		else{
		    return sum(n-1)+(1.0/n);
		}
	}
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		sc.close();
		System.out.printf("Sum of series: %.10f\n", sum(n));
	}

}