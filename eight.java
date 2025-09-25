//An internet cafe has 2 ways of charging. If the user is a member pays 2$/hour, Else the user pays 5$. Find if someone is a member or not and calculate the price based on how many hours the user spend.
//Create a program that:
//    Reads how many hours the user spend
//    Check if is a member
//    Print the total amount the user has to pay
//	Exemple_1:
//    Input: 5
//	   true
//    Output: The user is a member stayed 5 hours for 2 $/hour total amount is $10
//	Exemple_2:
//    Input: 5
//	   false
//    Output: The user is a member stayed 5 hours for 5 $/hour total amount is $25
//网吧有两种计费方式。如果用户是会员，则每小时支付 2 美元；否则，用户支付 5 美元。判断用户是否是会员，并根据用户使用时长计算价格。
//创建一个程序，用于：
//读取用户使用时长
//检查是否是会员
//打印用户需要支付的总金额
//示例 1：
//输入：5
//true
//输出：用户是会员，使用 5 小时，每小时支付 2 美元，总金额为 10 美元
//示例 2：
//输入：5
//false
//输出：用户是会员，使用 5 小时，每小时支付 5 美元，总金额为 25 美元
import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        // Define hourly rates
        final double MEMBER_RATE = 2.0;
        final double NON_MEMBER_RATE = 5.0;

        Scanner scanner = new Scanner(System.in);

        try {
            // Read hours spent
            System.out.print("Enter the number of hours the user spent: ");
            double hours = scanner.nextDouble();

            // Read membership status
            System.out.print("Is the user a member (true/false): ");
            boolean isMember = scanner.nextBoolean();

            // Validate hours (cannot be negative)
            if (hours < 0) {
                System.out.println("Error: Hours cannot be negative!");
                return;
            }

            // Calculate rate and total amount
            double rate = isMember ? MEMBER_RATE : NON_MEMBER_RATE;
            double total = hours * rate;

            // Prepare membership status string
            String membershipStatus = isMember ? "is a member" : "is not a member";

            // Display result in required format
            System.out.printf("The user %s stayed %.0f hours for %.0f $/hour total amount is $%.0f%n",
                    membershipStatus, hours, rate, total);

        } catch (Exception e) {
            // Handle invalid input errors
            System.out.println("Error: Please enter valid inputs (hours as number, membership as true/false)!");
        } finally {
            scanner.close();
        }
    }
}
