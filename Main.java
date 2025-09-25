//Create a program that reads a number and checks is it even or odd
//	Example_1:
//    Input: 2
//    Output: even
//	Example_2:
//    Input: 3
//    Output: odd
//创建一个程序，读取一个数字并检查其奇偶性。
//示例 1：
//输入：2
//输出：偶数
//示例 2：
//输入：3
//输出：奇数
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user to enter a number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Check if the number is even or odd
            if (number % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

        } catch (Exception e) {
            // Handle non-integer input errors
            System.out.println("Error: Please enter a valid integer!");
        } finally {
            scanner.close();
        }
    }
}
