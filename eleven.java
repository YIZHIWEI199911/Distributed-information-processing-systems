//Create a program that determines the season based on the months name.
//	Example_1:
//    Input: January
//    Ouput: Winter
//	Example_2:
//    Input: dfgfgf
//    Ouput: Wrong input!
//(Months: January February March April May June July August September October November December)
//(Seasons: Spring Autumn Summer Winter)
//创建一个程序，根据月份名称确定季节。
//示例 1：
//输入：一月
//输出：冬季
//示例 2：
//输入：dfgfgf
//输出：输入错误！
//（月份：一月、二月、三月、四月、五月、六月、七月、八月、九月、十月、十一月、十二月）
//（季节：春季、秋季、夏季、冬季）
import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read month input from user
            System.out.print("Enter a month: ");
            String month = scanner.nextLine().trim(); // Remove extra spaces

            String season;

            // Determine season using switch-case for month comparison
            switch (month) {
                // Winter months
                case "January":
                case "February":
                case "December":
                    season = "Winter";
                    break;

                // Spring months
                case "March":
                case "April":
                case "May":
                    season = "Spring";
                    break;

                // Summer months
                case "June":
                case "July":
                case "August":
                    season = "Summer";
                    break;

                // Autumn months
                case "September":
                case "October":
                case "November":
                    season = "Autumn";
                    break;

                // Invalid month input
                default:
                    System.out.println("Wrong input!");
                    return;
            }

            // Print the determined season
            System.out.println(season);

        } catch (Exception e) {
            // Handle any unexpected input errors
            System.out.println("Wrong input!");
        } finally {
            scanner.close();
        }
    }
}

