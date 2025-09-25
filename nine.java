//You've consumed X amount of Mbps on Wikipedia and Y amount of Mbps on memes. The cost of visiting Wikipedia is 0,10$ per Mb and the cost for watching memes is 0,05$ per Mb. If total consumption is less than 100$ print "Well consumption", if more - print "Too much consumption". If watching meme consumption is greater than reading wikipedia consumption print "HOW MANY MEMES".
//Create a program that:
//    Reads X(wikipedia Mb consupmtion) and Y(watching meme Mb consumption)
//    Calculates the total consumption
//    If total consumption greater than 100$ print proper message
//    If watching meme consumption is greater than reading wikipedia articles print proper messages
//	Example_1:
//    Input: 200, 200
//    Output: ""Well consumption"
//	Example_2:
//    Input: 1000, 1000
//    Output: "Too much consumption"
//	Example_3:
//    Input: 200, 2000
//    Output: "Too much consumption"
//            "HOW MANY MEMES"
//	Example_4:
//    Input: 100, 1000
//    Output: ""Well consumption"
//	    "HOW MANY MEMES"
//您在维基百科上消耗了 X Mbps 流量，在表情包上消耗了 Y Mbps 流量。访问维基百科的费用为每 MB 0.10 美元，观看表情包的费用为每 MB 0.05 美元。如果总消耗量低于 100 美元，则打印“Well consumption”（消耗量充足）；如果高于 100 美元，则打印“Too much consumption”（消耗量过多）。如果观看表情包的消耗量大于阅读维基百科的消耗量，则打印“HOW MANY MEMES”（表情包数量）。
//创建一个程序：
//读取 X（维基百科 MB 消耗）和 Y（观看 meme MB 消耗）
//计算总消耗
//如果总消耗大于 100 美元，则输出相应的信息
//如果观看 meme 的消耗大于阅读维基百科文章，则输出相应的信息
//示例 1：
//输入：200, 200
//输出：“消耗良好”
//示例 2：
//输入：1000, 1000
//输出：“消耗过多”
//示例 3：
//输入：200, 2000
//输出：“消耗过多”
//“MEME 数量”
//示例 4：
//输入：100, 1000
//输出：“消耗良好”
//“MEME 数量”
import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        // Define cost rates
        final double WIKIPEDIA_RATE = 0.10;  // $0.10 per MB
        final double MEME_RATE = 0.05;       // $0.05 per MB
        final double THRESHOLD = 100.0;      // $100 threshold for consumption messages

        Scanner scanner = new Scanner(System.in);

        try {
            // Read consumption values
            System.out.print("Enter Wikipedia MB consumption: ");
            double x = scanner.nextDouble();

            System.out.print("Enter meme MB consumption: ");
            double y = scanner.nextDouble();

            // Validate inputs (cannot be negative)
            if (x < 0 || y < 0) {
                System.out.println("Error: Consumption cannot be negative!");
                return;
            }

            // Calculate costs
            double wikiCost = x * WIKIPEDIA_RATE;
            double memeCost = y * MEME_RATE;
            double totalCost = wikiCost + memeCost;

            // Determine and print consumption message
            if (totalCost < THRESHOLD) {
                System.out.println("Well consumption");
            } else {
                System.out.println("Too much consumption");
            }

            // Check if meme consumption exceeds Wikipedia consumption
            if (y > x) {
                System.out.println("HOW MANY MEMES");
            }

        } catch (Exception e) {
            // Handle invalid input errors
            System.out.println("Error: Please enter valid numbers for consumption!");
        } finally {
            scanner.close();
        }
    }
}

