
import java.util.*;

public class D2UserInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        System.out.println("Your number : " + number);

        input.nextLine();
        System.out.println("Enter the name");
        String name = input.nextLine();
        System.out.println("Name : " + name);
        input.close();
    }
}
