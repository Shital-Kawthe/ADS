import java.util.Scanner;
class MultTableRecursion{
    static void printTable(int n, int i){
	    if(i>10){
		return;
		}
		else{
		System.out.println(n + "*" + i + "=" + (n * i));
		    printTable(n, i+1);
		}
	}
	
	
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		sc.close();
		printTable(n,1);
	}
}