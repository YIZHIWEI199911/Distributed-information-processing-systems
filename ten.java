//You want to buy something from Amazon. The seller charges different prices for shipping cost based on location. For US it's 5$ for Europe it's 7$ for Canada it's 3$ for other places it's 9$
//Create a program that:
//    Reads your location
//    Print the amount of money you have to pay for the shipping.
//	Example:
//    Input: Canada
//    Ouput: "You have to pay 3$ for shipping cost"
//你想在亚马逊上买东西。卖家会根据地点收取不同的运费。美国运费为 5 美元，欧洲运费为 7 美元，加拿大运费为 3 美元，其他地区运费为 9 美元。
//创建一个程序，用于：
//读取你的位置
//打印你需要支付的运费金额。
//示例：
//输入：加拿大
//输出：“你需要支付 3 美元的运费”
import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for location
            System.out.print("Enter your location: ");
            String location = scanner.nextLine().trim(); // Remove extra spaces

            // Determine shipping cost based on location
            int shippingCost;
            if (location.equals("US")) {
                shippingCost = 5;
            } else if (location.equals("Europe")) {
                shippingCost = 7;
            } else if (location.equals("Canada")) {
                shippingCost = 3;
            } else {
                shippingCost = 9; // For all other locations
            }

            // Print the result in the required format with quotes
            System.out.println("\"You have to pay " + shippingCost + "$ for shipping cost\"");

        } catch (Exception e) {
            // Handle unexpected input errors
            System.out.println("Error: Please enter a valid location!");
        } finally {
            scanner.close();
        }
    }
}
