//A cell phone company has the following billing policy
//				Fixed cost 25$
//Call duration(in seconds) 	Charge($/per second)
//	1-500 				0,01
//	501-800 			0,008
//	801+ 				0,005
//Create a program that:
//    Reads how many seconds was the calls duration
//    Calculates the monthly bill
//    Prints the total amount
//	Example:
//    Input: 1000
//    Output: total amount: 33,4$ (25 + (500 * 0,01 + 300 * 0,008 + 200 * 0.005))
//一家手机公司的计费策略如下：
//固定费用 25 美元
//通话时长（秒） 费用（美元/秒）
//1-500 0.01
//501-800 0.008
//801+ 0.005
//创建一个程序，用于：
//读取通话时长（秒）
//计算每月账单
//打印总金额
//示例：
//输入：1000
//输出：总金额：33.4 美元 (25 + (500 * 0.01 + 300 * 0.008 + 200 * 0.005))
import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {
        // Billing constants
        final double FIXED_COST = 25.0;
        final double RATE1 = 0.01;   // 1-500 seconds
        final double RATE2 = 0.008;  // 501-800 seconds
        final double RATE3 = 0.005;  // 801+ seconds

        Scanner scanner = new Scanner(System.in);

        try {
            // Read call duration in seconds
            System.out.print("Enter call duration in seconds: ");
            int duration = scanner.nextInt();

            // Validate input (cannot be negative)
            if (duration < 0) {
                System.out.println("Error: Call duration cannot be negative!");
                return;
            }

            // Calculate variable call cost based on tiers
            double variableCost = 0.0;
            String breakdown = "";

            if (duration <= 500) {
                variableCost = duration * RATE1;
                breakdown = "(25 + (" + duration + " * 0,01))";
            } else if (duration <= 800) {
                int tier2Seconds = duration - 500;
                variableCost = (500 * RATE1) + (tier2Seconds * RATE2);
                breakdown = "(25 + (500 * 0,01 + " + tier2Seconds + " * 0,008))";
            } else {
                int tier3Seconds = duration - 800;
                variableCost = (500 * RATE1) + (300 * RATE2) + (tier3Seconds * RATE3);
                breakdown = "(25 + (500 * 0,01 + 300 * 0,008 + " + tier3Seconds + " * 0.005))";
            }

            // Calculate total bill
            double totalBill = FIXED_COST + variableCost;

            // Display result with breakdown
            System.out.printf("total amount: %.1f$ %s%n", totalBill, breakdown);

        } catch (Exception e) {
            // Handle non-integer input errors
            System.out.println("Error: Please enter a valid number for call duration!");
        } finally {
            scanner.close();
        }
    }
}

