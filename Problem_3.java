import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();

        // number of odd numbers to print, if even num-1 to get odd value
        int count = (num % 2 == 0) ? (num - 1) : num;

        for (int i = 1; i <= count; i++) {
            System.out.print(2 * i - 1);
            if (i < count) {
                System.out.print(", ");
            }
        }
    }
}
