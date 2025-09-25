//Create a program that reads the number and checks is it less, more or equals 0
//	Example_1:
//    Input: 2
//    Output: more than 0
//	Example_2:
//    Input: -3
//    Output: less than 0
//	Example_3:
//    Input: 0
//    Output: equals 0
//创建一个程序，读取一个数字并检查其小于、大于还是等于 0。
//示例 1：
//输入：2
//输出：大于 0。
//示例 2：
//输入：-3
//输出：小于 0。
//示例 3：
//输入：0
//输出：等于 0。
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user to enter a number
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble(); // Handles both integers and decimals

            // Check the number against 0
            if (number > 0) {
                System.out.println("more than 0");
            } else if (number < 0) {
                System.out.println("less than 0");
            } else {
                System.out.println("equals 0");
            }

        } catch (Exception e) {
            // Handle non-numeric input errors
            System.out.println("Error: Please enter a valid number!");
        } finally {
            scanner.close();
        }
    }
}
