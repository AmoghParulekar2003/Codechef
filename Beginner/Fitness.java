import java.util.Scanner;

public class Fitness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int x = scanner.nextInt();
            System.out.println(x*10);
        }
        
    }
}
