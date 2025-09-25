//An integer number is given. Create a program that checks it and prints its description, like “negative even number”, “zero number”, “positive odd number”, etc.
//	Example_1:
//    Input: 2
//    Output: positive even number
//	Example_2:
//    Input: -3
//    Output: “negative odd number
//	Example_3:
//    Input: 0
//    Output: zero number
//给定一个整数。编写一个程序检查该整数并打印其描述，例如“负偶数”、“零”、“正奇数”等。
//示例 1：
//输入：2
//输出：正偶数
//示例 2：
//输入：-3
//输出：负奇数
//示例 3：
//输入：0
//输出：零
import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user to enter an integer
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            String classification = "";

            // Check if the number is zero
            if (number == 0) {
                classification = "zero number";
            } else {
                // Determine if positive or negative
                String sign = (number > 0) ? "positive" : "negative";

                // Determine if even or odd
                String parity = (number % 2 == 0) ? "even" : "odd";

                // Combine results
                classification = sign + " " + parity + " number";
            }

            // Output the classification
            System.out.println(classification);

        } catch (Exception e) {
            // Handle non-integer input errors
            System.out.println("Error: Please enter a valid integer!");
        } finally {
            scanner.close();
        }
    }
}
