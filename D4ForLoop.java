import java.util.*;

public class D4ForLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;

        // Sum of all numbers till n
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum till " + n + " is " + sum);
        sc.close();
    }
}
