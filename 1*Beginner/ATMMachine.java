import java.util.*;
import java.lang.*;
import java.io.*;

class ATMMachine
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter number of trials: ");
		int t = sc.nextInt();
		
		while(t-->0) {
		    //System.out.println("Enter amount: ");
		    int n = sc.nextInt();
		    //System.out.println("Enter number of people: ");
		    int k = sc.nextInt();
		    int res[] = new int[n];
		    
		    for(int i = 0; i < n; i++) {
		        //System.out.println("Enter amount to withdraw: ");
		        int a = sc.nextInt();
		        if(a<=k) {
		            res[i] = 1;
		            k = k - a;
		        } else {
		            res[i] = 0;
		        }
		    }
		    for(int i = 0; i < n; i++) {
		        System.out.print(res[i]);
		    }
		    System.out.println();
		}
	}
}
