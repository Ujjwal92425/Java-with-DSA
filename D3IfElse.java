
import java.util.*;

public class D3IfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age.");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("You can vote.");
        } else if (age == 18) {
            System.out.println("You can vote next year.");
        } else {
            System.out.println("You can't vote.");
        }
        sc.close();
    }

}
