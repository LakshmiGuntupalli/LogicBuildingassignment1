import java.util.*;
public class QUESTION1 {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    int i,n=25;
	    int arr[] = new int[n];
	    System.out.println("Enter 25 elements of array : ");
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();	
		}
	    int max = arr[0];
	    for (i = 1; i < n; i++){
	        if (arr[i] > max)
	            max = arr[i];
	       }
	    System.out.println(max);
	}
}

