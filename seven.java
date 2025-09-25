//In a company the monthly salary of an employee is calculated by minimum wage 400$ per month, plus 20$ multiply by the employment years, plus 30$ for each employee kid, plus 100$ if the employee didn't miss any day of work.
//Create a program that:
//Reads the employment years
//Reads the number of each employee kids
//Reads how many days of work the employee miss
//Prints the total amount the employee must take
//Output: "The total amount is 660$, 400$ minimum wage + 100$ for 5 years experience + 60$ for 2 kids + 100$ for not missing a day at work"
//一家公司的员工月薪按最低工资 400 美元计算，再乘以工作年限，每生一个孩子加收 20 美元，如果员工没有缺勤，则加收 100 美元。
//创建一个程序，用于：
//读取员工的工作年限
//
//读取每个员工的孩子数量
//
//读取员工缺勤的天数
//
//打印员工应支付的总金额
//输出：“总金额为 660 美元，最低工资 400 美元 + 5 年工作经验加收 100 美元 + 两个孩子加收 60 美元 + 未缺勤加收 100 美元”
import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        // Constants for salary components
        final int MINIMUM_WAGE = 400;
        final int YEAR_BONUS = 20;
        final int KID_BONUS = 30;
        final int ATTENDANCE_BONUS = 100;

        Scanner scanner = new Scanner(System.in);

        try {
            // Read input values
            System.out.print("Enter number of employment years: ");
            int employmentYears = scanner.nextInt();

            System.out.print("Enter number of kids: ");
            int numberOfKids = scanner.nextInt();

            System.out.print("Enter number of missed work days: ");
            int missedDays = scanner.nextInt();

            // Validate inputs (non-negative values only)
            if (employmentYears < 0 || numberOfKids < 0 || missedDays < 0) {
                System.out.println("Error: All values must be non-negative!");
                return;
            }

            // Calculate each salary component
            int yearsContribution = YEAR_BONUS * employmentYears;
            int kidsContribution = KID_BONUS * numberOfKids;
            int attendanceContribution = (missedDays == 0) ? ATTENDANCE_BONUS : 0;
            int totalSalary = MINIMUM_WAGE + yearsContribution + kidsContribution + attendanceContribution;

            // Handle singular/plural for years and kids
            String yearLabel = (employmentYears == 1) ? "year" : "years";
            String kidLabel = (numberOfKids == 1) ? "kid" : "kids";

            // Build the breakdown string
            StringBuilder breakdown = new StringBuilder();
            breakdown.append(MINIMUM_WAGE).append("$ minimum wage");
            breakdown.append(" + ").append(yearsContribution).append("$ for ").append(employmentYears).append(" ").append(yearLabel).append(" experience");
            breakdown.append(" + ").append(kidsContribution).append("$ for ").append(numberOfKids).append(" ").append(kidLabel);

            // Add attendance bonus if applicable
            if (attendanceContribution > 0) {
                breakdown.append(" + ").append(ATTENDANCE_BONUS).append("$ for not missing a day at work");
            }

            // Output the final result
            System.out.printf("The total amount is %d$, %s%n", totalSalary, breakdown.toString());

        } catch (Exception e) {
            // Handle invalid input errors
            System.out.println("Error: Please enter valid integers!");
        } finally {
            scanner.close();
        }
    }
}
