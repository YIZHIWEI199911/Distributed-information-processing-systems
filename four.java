//Create a program that find a minimum from 3 integer numbers.
//Example:
//Input: 2
//        5
//        3
//Output: 2
//创建一个程序，从 3 个整数中找出最小值。
//示例：
//输入：2
//5
//3
//输出：2。
import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read three integers from user input
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            System.out.print("Enter the third integer: ");
            int num3 = scanner.nextInt();

            // Find the minimum value using Math.min()
            // Nest Math.min() to compare three values
            int min = Math.min(num1, Math.min(num2, num3));

            // Output the result
            System.out.println(min);

        } catch (Exception e) {
            // Handle non-integer input errors
            System.out.println("Error: Please enter valid integers!");
        } finally {
            scanner.close();
        }
    }
}

