import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print((2 * i - 1));
            if (i < num)
                System.out.print(", ");
        }
    }
}
