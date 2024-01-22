import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
		    int n = sc.nextInt();
		    String s = sc.next();
		    
		    int c = 4;
		    for(int i = 0; i < n; i++) {
		        if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
		            c = 4;
		            
		        } else {
		            c--;
		            
		            if(c==0) {
		                System.out.println("NO");
		                break;
		            } else {
		                continue;
		            }
		        }
		    }
		    if(c != 0) {
		        System.out.println("YES");
		    }
		}
	}
}
