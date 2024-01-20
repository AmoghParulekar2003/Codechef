import java.util.Scanner;
import java.lang.*;
import java.io.*;

class ChristmasGreeting
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();
		
		if (date >= 1 && date <= 31) {
    		if(date == 25) {
    		    System.out.println("CHRISTMAS");
    		} else {
    		    System.out.println("ORDINARY");
    		}
		} else {
		    System.exit(0);
		}
	}
}
