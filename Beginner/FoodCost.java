import java.util.*;
import java.lang.*;
import java.io.*;

class FoodCost
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>=1 && x<y && y<=1000) {
    		int res = 6*x + y;
    		System.out.println(res);
		} else {
		    System.exit(0);
		}
	}
}
