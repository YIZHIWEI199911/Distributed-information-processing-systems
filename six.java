//It's the end of the semester and you got your marks from, Geometry, Algebra, Physics classes. If the average score is 7 and above print "Good job!", if the average score is between 6 and 4 print "You need to work harder!", if the average score is below 4 print "Failed, you really need to work harder!".
//Create a program that:
//Reads the values of these 3 lessons
//Calculate the average of your grades
//Example: Geometry = 6, Algebra = 7, Physics = 8
//Output: Your average score is 7, Good job!"
//Warning! Do not use the programming language magic. After you complete the exercise feel free to do so.
//学期结束了，你拿到了几何、代数和物理的成绩。如果平均分在7分以上，请打印“做得好！”；如果平均分在6到4分之间，请打印“你需要更加努力！”；如果平均分低于4分，请打印“不及格，你真的需要更加努力！”。
//创建一个程序，用于：
//读取这三门课程的成绩
//计算你的平均成绩
//示例：几何 = 6，代数 = 7，物理 = 8
//输出：你的平均成绩是 7，干得好！
//警告！请勿使用编程语言的魔法。完成练习后，请随意使用。
import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read grades for each subject
            System.out.print("Enter Geometry grade: ");
            int geometry = scanner.nextInt();

            System.out.print("Enter Algebra grade: ");
            int algebra = scanner.nextInt();

            System.out.print("Enter Physics grade: ");
            int physics = scanner.nextInt();

            // Calculate average (using basic arithmetic)
            int sum = geometry + algebra + physics;
            double average = sum / 3.0;  // Use 3.0 to get decimal result

            // Determine feedback message using basic conditionals
            String feedback;
            if (average >= 7) {
                feedback = "Good job!";
            } else if (average >= 4 && average < 7) {  // Between 4 and 6 (inclusive)
                feedback = "You need to work harder!";
            } else {  // Below 4
                feedback = "Failed, you really need to work harder!";
            }

            // Display result in the required format
            System.out.printf("Your average score is %.0f, %s%n", average, feedback);

        } catch (Exception e) {
            // Handle invalid input
            System.out.println("Error: Please enter valid grades (integers)!");
        } finally {
            scanner.close();
        }
    }
}
